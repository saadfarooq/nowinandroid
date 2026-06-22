package com.google.samples.apps.nowinandroid.feature.bookmarks.impl;

import com.google.samples.apps.nowinandroid.core.data.repository.UserDataRepository;
import com.google.samples.apps.nowinandroid.core.data.repository.UserNewsResourceRepository;
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
public final class BookmarksViewModel_Factory implements Factory<BookmarksViewModel> {
  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider;

  private BookmarksViewModel_Factory(Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider) {
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.userNewsResourceRepositoryProvider = userNewsResourceRepositoryProvider;
  }

  @Override
  public BookmarksViewModel get() {
    return newInstance(userDataRepositoryProvider.get(), userNewsResourceRepositoryProvider.get());
  }

  public static BookmarksViewModel_Factory create(
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<UserNewsResourceRepository> userNewsResourceRepositoryProvider) {
    return new BookmarksViewModel_Factory(userDataRepositoryProvider, userNewsResourceRepositoryProvider);
  }

  public static BookmarksViewModel newInstance(UserDataRepository userDataRepository,
      UserNewsResourceRepository userNewsResourceRepository) {
    return new BookmarksViewModel(userDataRepository, userNewsResourceRepository);
  }
}
