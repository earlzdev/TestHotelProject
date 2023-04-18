// Generated by Dagger (https://dagger.dev).
package com.earl.hotel_search.presentation.hotelsSearch;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SearchHotelsFragment_MembersInjector implements MembersInjector<SearchHotelsFragment> {
  private final Provider<SearchHotelsViewModel.Factory> searchAirportsViewModelFactoryProvider;

  public SearchHotelsFragment_MembersInjector(
      Provider<SearchHotelsViewModel.Factory> searchAirportsViewModelFactoryProvider) {
    this.searchAirportsViewModelFactoryProvider = searchAirportsViewModelFactoryProvider;
  }

  public static MembersInjector<SearchHotelsFragment> create(
      Provider<SearchHotelsViewModel.Factory> searchAirportsViewModelFactoryProvider) {
    return new SearchHotelsFragment_MembersInjector(searchAirportsViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SearchHotelsFragment instance) {
    injectSearchAirportsViewModelFactory(instance, DoubleCheck.lazy(searchAirportsViewModelFactoryProvider));
  }

  @InjectedFieldSignature("com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsFragment.searchAirportsViewModelFactory")
  public static void injectSearchAirportsViewModelFactory(SearchHotelsFragment instance,
      Lazy<SearchHotelsViewModel.Factory> searchAirportsViewModelFactory) {
    instance.searchAirportsViewModelFactory = searchAirportsViewModelFactory;
  }
}
