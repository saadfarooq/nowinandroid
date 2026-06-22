package com.google.samples.apps.nowinandroid.core.data.repository;

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
public final class CompositeUserNewsResourceRepository_Factory implements Factory<CompositeUserNewsResourceRepository> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private CompositeUserNewsResourceRepository_Factory(
      Provider<NewsRepository> newsRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
  }

  @Override
  public CompositeUserNewsResourceRepository get() {
    return newInstance(newsRepositoryProvider.get(), userDataRepositoryProvider.get());
  }

  public static CompositeUserNewsResourceRepository_Factory create(
      Provider<NewsRepository> newsRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider) {
    return new CompositeUserNewsResourceRepository_Factory(newsRepositoryProvider, userDataRepositoryProvider);
  }

  public static CompositeUserNewsResourceRepository newInstance(NewsRepository newsRepository,
      UserDataRepository userDataRepository) {
    return new CompositeUserNewsResourceRepository(newsRepository, userDataRepository);
  }
}
