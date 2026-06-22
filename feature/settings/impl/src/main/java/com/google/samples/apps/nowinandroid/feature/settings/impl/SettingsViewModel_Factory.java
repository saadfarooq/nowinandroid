package com.google.samples.apps.nowinandroid.feature.settings.impl;

import com.google.samples.apps.nowinandroid.core.data.repository.UserDataRepository;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private SettingsViewModel_Factory(Provider<UserDataRepository> userDataRepositoryProvider) {
    this.userDataRepositoryProvider = userDataRepositoryProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(userDataRepositoryProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<UserDataRepository> userDataRepositoryProvider) {
    return new SettingsViewModel_Factory(userDataRepositoryProvider);
  }

  public static SettingsViewModel newInstance(UserDataRepository userDataRepository) {
    return new SettingsViewModel(userDataRepository);
  }
}
