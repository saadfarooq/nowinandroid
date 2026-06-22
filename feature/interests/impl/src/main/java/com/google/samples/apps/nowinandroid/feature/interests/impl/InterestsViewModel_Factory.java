package com.google.samples.apps.nowinandroid.feature.interests.impl;

import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.nowinandroid.core.data.repository.UserDataRepository;
import com.google.samples.apps.nowinandroid.core.domain.GetFollowableTopicsUseCase;
import com.google.samples.apps.nowinandroid.feature.interests.api.navigation.InterestsNavKey;
import dagger.internal.DaggerGenerated;
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
public final class InterestsViewModel_Factory {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<GetFollowableTopicsUseCase> getFollowableTopicsProvider;

  private InterestsViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<GetFollowableTopicsUseCase> getFollowableTopicsProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.getFollowableTopicsProvider = getFollowableTopicsProvider;
  }

  public InterestsViewModel get(InterestsNavKey key) {
    return newInstance(savedStateHandleProvider.get(), userDataRepositoryProvider.get(), getFollowableTopicsProvider.get(), key);
  }

  public static InterestsViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<GetFollowableTopicsUseCase> getFollowableTopicsProvider) {
    return new InterestsViewModel_Factory(savedStateHandleProvider, userDataRepositoryProvider, getFollowableTopicsProvider);
  }

  public static InterestsViewModel newInstance(SavedStateHandle savedStateHandle,
      UserDataRepository userDataRepository, GetFollowableTopicsUseCase getFollowableTopics,
      InterestsNavKey key) {
    return new InterestsViewModel(savedStateHandle, userDataRepository, getFollowableTopics, key);
  }
}
