package com.google.samples.apps.nowinandroid.feature.topic.impl;

import com.google.samples.apps.nowinandroid.core.data.repository.TopicsRepository;
import com.google.samples.apps.nowinandroid.core.data.repository.UserDataRepository;
import com.google.samples.apps.nowinandroid.core.data.repository.UserNewsResourceRepository;
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
public final class TopicViewModel_Factory {
  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<TopicsRepository> topicsRepositoryProvider;

  private final Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider;

  private TopicViewModel_Factory(Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<TopicsRepository> topicsRepositoryProvider,
      Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider) {
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.topicsRepositoryProvider = topicsRepositoryProvider;
    this.userNewsResourceRepositoryProvider = userNewsResourceRepositoryProvider;
  }

  public TopicViewModel get(String topicId) {
    return newInstance(userDataRepositoryProvider.get(), topicsRepositoryProvider.get(), userNewsResourceRepositoryProvider.get(), topicId);
  }

  public static TopicViewModel_Factory create(
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<TopicsRepository> topicsRepositoryProvider,
      Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider) {
    return new TopicViewModel_Factory(userDataRepositoryProvider, topicsRepositoryProvider, userNewsResourceRepositoryProvider);
  }

  public static TopicViewModel newInstance(UserDataRepository userDataRepository,
      TopicsRepository topicsRepository, UserNewsResourceRepository userNewsResourceRepository,
      String topicId) {
    return new TopicViewModel(userDataRepository, topicsRepository, userNewsResourceRepository, topicId);
  }
}
