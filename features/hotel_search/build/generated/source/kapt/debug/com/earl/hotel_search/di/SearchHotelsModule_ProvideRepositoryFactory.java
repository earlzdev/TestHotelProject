// Generated by Dagger (https://dagger.dev).
package com.earl.hotel_search.di;

import com.earl.hotel_search.domain.Repository;
import com.earl.hotel_search.domain.models.Hotel;
import com.earl.hotel_search.domain.models.HotelDetails;
import com.earl.remotedatasource.NetworkService;
import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper;
import com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SearchHotelsModule_ProvideRepositoryFactory implements Factory<Repository> {
  private final SearchHotelsModule module;

  private final Provider<NetworkService> networkServiceProvider;

  private final Provider<HotelRemoteToMainMapper<Hotel>> hotelRemoteToMainMapperProvider;

  private final Provider<HotelsDetailsRemoteMapper<HotelDetails>> hotelDetailsRemoteToMainMapperProvider;

  public SearchHotelsModule_ProvideRepositoryFactory(SearchHotelsModule module,
      Provider<NetworkService> networkServiceProvider,
      Provider<HotelRemoteToMainMapper<Hotel>> hotelRemoteToMainMapperProvider,
      Provider<HotelsDetailsRemoteMapper<HotelDetails>> hotelDetailsRemoteToMainMapperProvider) {
    this.module = module;
    this.networkServiceProvider = networkServiceProvider;
    this.hotelRemoteToMainMapperProvider = hotelRemoteToMainMapperProvider;
    this.hotelDetailsRemoteToMainMapperProvider = hotelDetailsRemoteToMainMapperProvider;
  }

  @Override
  public Repository get() {
    return provideRepository(module, networkServiceProvider.get(), hotelRemoteToMainMapperProvider.get(), hotelDetailsRemoteToMainMapperProvider.get());
  }

  public static SearchHotelsModule_ProvideRepositoryFactory create(SearchHotelsModule module,
      Provider<NetworkService> networkServiceProvider,
      Provider<HotelRemoteToMainMapper<Hotel>> hotelRemoteToMainMapperProvider,
      Provider<HotelsDetailsRemoteMapper<HotelDetails>> hotelDetailsRemoteToMainMapperProvider) {
    return new SearchHotelsModule_ProvideRepositoryFactory(module, networkServiceProvider, hotelRemoteToMainMapperProvider, hotelDetailsRemoteToMainMapperProvider);
  }

  public static Repository provideRepository(SearchHotelsModule instance,
      NetworkService networkService, HotelRemoteToMainMapper<Hotel> hotelRemoteToMainMapper,
      HotelsDetailsRemoteMapper<HotelDetails> hotelDetailsRemoteToMainMapper) {
    return Preconditions.checkNotNullFromProvides(instance.provideRepository(networkService, hotelRemoteToMainMapper, hotelDetailsRemoteToMainMapper));
  }
}
