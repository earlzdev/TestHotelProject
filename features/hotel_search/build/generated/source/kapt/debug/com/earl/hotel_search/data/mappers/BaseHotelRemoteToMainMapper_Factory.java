// Generated by Dagger (https://dagger.dev).
package com.earl.hotel_search.data.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class BaseHotelRemoteToMainMapper_Factory implements Factory<BaseHotelRemoteToMainMapper> {
  @Override
  public BaseHotelRemoteToMainMapper get() {
    return newInstance();
  }

  public static BaseHotelRemoteToMainMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BaseHotelRemoteToMainMapper newInstance() {
    return new BaseHotelRemoteToMainMapper();
  }

  private static final class InstanceHolder {
    private static final BaseHotelRemoteToMainMapper_Factory INSTANCE = new BaseHotelRemoteToMainMapper_Factory();
  }
}
