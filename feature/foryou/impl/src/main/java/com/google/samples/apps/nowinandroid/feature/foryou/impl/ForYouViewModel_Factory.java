package com.google.samples.apps.nowinandroid.feature.foryou.impl;

import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.nowinandroid.core.analytics.AnalyticsHelper;
import com.google.samples.apps.nowinandroid.core.data.repository.UserDataRepository;
import com.google.samples.apps.nowinandroid.core.data.repository.UserNewsResourceRepository;
import com.google.samples.apps.nowinandroid.core.data.util.SyncManager;
import com.google.samples.apps.nowinandroid.core.domain.GetFollowableTopicsUseCase;
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
public final class ForYouViewModel_Factory implements Factory<ForYouViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<SyncManager> syncManagerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider;

  private final Provider<GetFollowableTopicsUseCase> getFollowableTopicsProvider;

  private ForYouViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<SyncManager> syncManagerProvider, Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider,
      Provider<GetFollowableTopicsUseCase> getFollowableTopicsProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.syncManagerProvider = syncManagerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.userNewsResourceRepositoryProvider = userNewsResourceRepositoryProvider;
    this.getFollowableTopicsProvider = getFollowableTopicsProvider;
  }

  @Override
  public ForYouViewModel get() {
    return newInstance(savedStateHandleProvider.get(), syncManagerProvider.get(), analyticsHelperProvider.get(), userDataRepositoryProvider.get(), userNewsResourceRepositoryProvider.get(), getFollowableTopicsProvider.get());
  }

  public static ForYouViewModel_Factory create(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<SyncManager> syncManagerProvider, Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider,
      Provider<GetFollowableTopicsUseCase> getFollowableTopicsProvider) {
    return new ForYouViewModel_Factory(savedStateHandleProvider, syncManagerProvider, analyticsHelperProvider, userDataRepositoryProvider, userNewsResourceRepositoryProvider, getFollowableTopicsProvider);
  }

  public static ForYouViewModel newInstance(SavedStateHandle savedStateHandle,
      SyncManager syncManager, AnalyticsHelper analyticsHelper,
      UserDataRepository userDataRepository, UserNewsResourceRepository userNewsResourceRepository,
      GetFollowableTopicsUseCase getFollowableTopics) {
    return new ForYouViewModel(savedStateHandle, syncManager, analyticsHelper, userDataRepository, userNewsResourceRepository, getFollowableTopics);
  }
}
