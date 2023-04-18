package com.earl.hotel_search.testData

import com.earl.hotel_search.data.mappers.BaseHotelDetailsRemoteToMainMapper
import com.earl.hotel_search.data.mappers.BaseHotelRemoteToMainMapper
import com.earl.hotel_search.domain.models.Hotel
import com.earl.hotel_search.domain.models.HotelDetails
import com.earl.remotedatasource.NetworkService
import com.earl.remotedatasource.models.HotelDetailsRemote
import com.earl.remotedatasource.models.HotelRemote
import junit.framework.TestCase.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.kotlin.whenever

class TestRepositoryImpl {

    @Mock
    private val networkService = mock(NetworkService::class.java)
    @Mock
    private val hotelDetailsRemoteToMainMapper = BaseHotelDetailsRemoteToMainMapper()
    @Mock
    private val hotelRemoteToMainMapper = BaseHotelRemoteToMainMapper()
    private val expectedHotelDetailsRemote = HotelDetailsRemote(
        1,
        "Hotel name",
        "Address",
        3.5,
        99.0,
        "5",
        "4, 5",
        45.0,
        45.0
    )

    private val expectedHotelRemote = HotelRemote(
        0,
        "Name",
        "Address",
        4.5,
        45.5,
        "4,5,6"
    )

    private val expectedHotelsRemoteList = listOf(expectedHotelRemote, expectedHotelRemote)

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `is fetchHotels method returns right value`() = runTest {
        whenever(networkService.fetchHotels("")).thenReturn(expectedHotelsRemoteList)
        val hotelsList = networkService.fetchHotels("")
        assertNotNull(hotelsList.size)
        assertEquals(hotelsList, expectedHotelsRemoteList)
        assertTrue(hotelsList.any { it is HotelRemote })
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `is fetchHotelDetails method returns right value`() = runTest {
        whenever(networkService.fetchHotelDetails("")).thenReturn(expectedHotelDetailsRemote)
        val hotelInfo = networkService.fetchHotelDetails("")
        assertNotNull(hotelInfo)
        assertTrue(hotelInfo is HotelDetailsRemote)
        assertNotNull(hotelInfo.name)
        assertNotNull(hotelInfo.address)
        assertEquals(hotelInfo.name, expectedHotelDetailsRemote.name)
        assertEquals(hotelInfo.id, expectedHotelDetailsRemote.id)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `is HotelDetailsRemoteToMainMapper returns HotelDetails`() = runTest {
        whenever(networkService.fetchHotelDetails("")).thenReturn(expectedHotelDetailsRemote)
        val hotelDetailsRemote = networkService.fetchHotelDetails("")
        val hotelDetailsMain = hotelDetailsRemote.map(hotelDetailsRemoteToMainMapper)
        assertTrue(hotelDetailsMain is HotelDetails)
        assertEquals(hotelDetailsRemote.name, hotelDetailsMain.name)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `is HotelRemoteToMainMapper return Hotel`() = runTest {
        whenever(networkService.fetchHotels("")).thenReturn(expectedHotelsRemoteList)
        val hotelsRemote = networkService.fetchHotels("")
        val hotelsMain = hotelsRemote.map { it.mapToMain(hotelRemoteToMainMapper) }
        assertTrue(hotelsMain.any{ it is Hotel })
        assertEquals(hotelsRemote[0].name, hotelsMain[0].name)
    }
}