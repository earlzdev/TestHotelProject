// Generated by Dagger (https://dagger.dev).
package com.earl.hotel_search.di;

import com.earl.hotel_search.domain.models.HotelDetails;
import com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SearchHotelsModule_ProvideHotelDetailsRemoteToMainMapperFactory implements Factory<HotelsDetailsRemoteMapper<HotelDetails>> {
  private final SearchHotelsModule module;

  public SearchHotelsModule_ProvideHotelDetailsRemoteToMainMapperFactory(
      SearchHotelsModule module) {
    this.module = module;
  }

  @Override
  public HotelsDetailsRemoteMapper<HotelDetails> get() {
    return provideHotelDetailsRemoteToMainMapper(module);
  }

  public static SearchHotelsModule_ProvideHotelDetailsRemoteToMainMapperFactory create(
      SearchHotelsModule module) {
    return new SearchHotelsModule_ProvideHotelDetailsRemoteToMainMapperFactory(module);
  }

  public static HotelsDetailsRemoteMapper<HotelDetails> provideHotelDetailsRemoteToMainMapper(
      SearchHotelsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHotelDetailsRemoteToMainMapper());
  }
}
