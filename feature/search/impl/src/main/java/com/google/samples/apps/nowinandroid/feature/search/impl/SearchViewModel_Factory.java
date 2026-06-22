package com.google.samples.apps.nowinandroid.feature.search.impl;

import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.nowinandroid.core.analytics.AnalyticsHelper;
import com.google.samples.apps.nowinandroid.core.data.repository.RecentSearchRepository;
import com.google.samples.apps.nowinandroid.core.data.repository.SearchContentsRepository;
import com.google.samples.apps.nowinandroid.core.data.repository.UserDataRepository;
import com.google.samples.apps.nowinandroid.core.domain.GetRecentSearchQueriesUseCase;
import com.google.samples.apps.nowinandroid.core.domain.GetSearchContentsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<GetSearchContentsUseCase> getSearchContentsUseCaseProvider;

  private final Provider<GetRecentSearchQueriesUseCase> recentSearchQueriesUseCaseProvider;

  private final Provider<SearchContentsRepository> searchContentsRepositoryProvider;

  private final Provider<RecentSearchRepository> recentSearchRepositoryProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private SearchViewModel_Factory(
      Provider<GetSearchContentsUseCase> getSearchContentsUseCaseProvider,
      Provider<GetRecentSearchQueriesUseCase> recentSearchQueriesUseCaseProvider,
      Provider<SearchContentsRepository> searchContentsRepositoryProvider,
      Provider<RecentSearchRepository> recentSearchRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.getSearchContentsUseCaseProvider = getSearchContentsUseCaseProvider;
    this.recentSearchQueriesUseCaseProvider = recentSearchQueriesUseCaseProvider;
    this.searchContentsRepositoryProvider = searchContentsRepositoryProvider;
    this.recentSearchRepositoryProvider = recentSearchRepositoryProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(getSearchContentsUseCaseProvider.get(), recentSearchQueriesUseCaseProvider.get(), searchContentsRepositoryProvider.get(), recentSearchRepositoryProvider.get(), userDataRepositoryProvider.get(), savedStateHandleProvider.get(), analyticsHelperProvider.get());
  }

  public static SearchViewModel_Factory create(
      Provider<GetSearchContentsUseCase> getSearchContentsUseCaseProvider,
      Provider<GetRecentSearchQueriesUseCase> recentSearchQueriesUseCaseProvider,
      Provider<SearchContentsRepository> searchContentsRepositoryProvider,
      Provider<RecentSearchRepository> recentSearchRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new SearchViewModel_Factory(getSearchContentsUseCaseProvider, recentSearchQueriesUseCaseProvider, searchContentsRepositoryProvider, recentSearchRepositoryProvider, userDataRepositoryProvider, savedStateHandleProvider, analyticsHelperProvider);
  }

  public static SearchViewModel newInstance(GetSearchContentsUseCase getSearchContentsUseCase,
      GetRecentSearchQueriesUseCase recentSearchQueriesUseCase,
      SearchContentsRepository searchContentsRepository,
      RecentSearchRepository recentSearchRepository, UserDataRepository userDataRepository,
      SavedStateHandle savedStateHandle, AnalyticsHelper analyticsHelper) {
    return new SearchViewModel(getSearchContentsUseCase, recentSearchQueriesUseCase, searchContentsRepository, recentSearchRepository, userDataRepository, savedStateHandle, analyticsHelper);
  }
}
