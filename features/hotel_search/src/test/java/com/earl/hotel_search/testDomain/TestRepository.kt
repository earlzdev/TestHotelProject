package com.earl.hotel_search.testDomain

import com.earl.hotel_search.data.RepositoryImpl
import com.earl.hotel_search.domain.models.Hotel
import com.earl.hotel_search.domain.models.HotelDetails
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.kotlin.whenever

class TestRepository {

    @Mock
    private val repositoryImpl = mock(RepositoryImpl::class.java)

    private val expectedHotelsListFromRepoImpl = listOf(
        Hotel(0, "name1", "address1", 4.5, 50.0, "4, 5, 6"),
        Hotel(1, "name2", "address2", 4.4, 45.0, "2, 5, 6"),
        Hotel(2, "name3", "address3", 2.5, 36.0, "4, 6, 1"),
    )

    private val expectedHotelDetailsFromRepoImpl = HotelDetails(
        0,
        "name",
        "address",
        3.5,
        50.6,
        "image",
        "3, 7, 8",
        45.0,
        45.0
    )

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `is fetch Hotels List Method returns Hotel model`() = runTest {
        whenever(repositoryImpl.fetchHotels()).thenReturn(expectedHotelsListFromRepoImpl)
        val repoList = repositoryImpl.fetchHotels()
        assertEquals(repoList, expectedHotelsListFromRepoImpl)
        assertEquals(repoList[0].name, expectedHotelsListFromRepoImpl[0].name)
        assertTrue(repoList.any{ it is Hotel })
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `is fetch Hotel Info method returns HotelInfo model`() = runTest {
        whenever(repositoryImpl.fetchHotelInfo(0)).thenReturn(expectedHotelDetailsFromRepoImpl)
        assertEquals(repositoryImpl.fetchHotelInfo(0), expectedHotelDetailsFromRepoImpl)
    }
}