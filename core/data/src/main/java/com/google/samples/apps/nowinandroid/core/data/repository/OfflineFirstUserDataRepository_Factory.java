package com.google.samples.apps.nowinandroid.core.data.repository;

import com.google.samples.apps.nowinandroid.core.analytics.AnalyticsHelper;
import com.google.samples.apps.nowinandroid.core.datastore.NiaPreferencesDataSource;
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
public final class OfflineFirstUserDataRepository_Factory implements Factory<OfflineFirstUserDataRepository> {
  private final Provider<NiaPreferencesDataSource> niaPreferencesDataSourceProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private OfflineFirstUserDataRepository_Factory(
      Provider<NiaPreferencesDataSource> niaPreferencesDataSourceProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.niaPreferencesDataSourceProvider = niaPreferencesDataSourceProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  @Override
  public OfflineFirstUserDataRepository get() {
    return newInstance(niaPreferencesDataSourceProvider.get(), analyticsHelperProvider.get());
  }

  public static OfflineFirstUserDataRepository_Factory create(
      Provider<NiaPreferencesDataSource> niaPreferencesDataSourceProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new OfflineFirstUserDataRepository_Factory(niaPreferencesDataSourceProvider, analyticsHelperProvider);
  }

  public static OfflineFirstUserDataRepository newInstance(
      NiaPreferencesDataSource niaPreferencesDataSource, AnalyticsHelper analyticsHelper) {
    return new OfflineFirstUserDataRepository(niaPreferencesDataSource, analyticsHelper);
  }
}
