package com.google.samples.apps.nowinandroid.core.datastore;

import androidx.datastore.core.DataStore;
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
public final class NiaPreferencesDataSource_Factory implements Factory<NiaPreferencesDataSource> {
  private final Provider<DataStore<UserPreferences>> userPreferencesProvider;

  private NiaPreferencesDataSource_Factory(
      Provider<DataStore<UserPreferences>> userPreferencesProvider) {
    this.userPreferencesProvider = userPreferencesProvider;
  }

  @Override
  public NiaPreferencesDataSource get() {
    return newInstance(userPreferencesProvider.get());
  }

  public static NiaPreferencesDataSource_Factory create(
      Provider<DataStore<UserPreferences>> userPreferencesProvider) {
    return new NiaPreferencesDataSource_Factory(userPreferencesProvider);
  }

  public static NiaPreferencesDataSource newInstance(DataStore<UserPreferences> userPreferences) {
    return new NiaPreferencesDataSource(userPreferences);
  }
}
