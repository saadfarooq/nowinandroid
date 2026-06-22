package com.google.samples.apps.nowinandroid.core.datastore.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.samples.apps.nowinandroid.core.datastore.UserPreferences;
import com.google.samples.apps.nowinandroid.core.datastore.UserPreferencesSerializer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "dagger.hilt.android.qualifiers.ApplicationContext",
    "com.google.samples.apps.nowinandroid.core.common.network.Dispatcher",
    "com.google.samples.apps.nowinandroid.core.common.network.di.ApplicationScope"
})
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
public final class DataStoreModule_ProvidesUserPreferencesDataStore$datastoreFactory implements Factory<DataStore<UserPreferences>> {
  private final Provider<Context> contextProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<CoroutineScope> scopeProvider;

  private final Provider<UserPreferencesSerializer> userPreferencesSerializerProvider;

  private DataStoreModule_ProvidesUserPreferencesDataStore$datastoreFactory(
      Provider<Context> contextProvider, Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CoroutineScope> scopeProvider,
      Provider<UserPreferencesSerializer> userPreferencesSerializerProvider) {
    this.contextProvider = contextProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.scopeProvider = scopeProvider;
    this.userPreferencesSerializerProvider = userPreferencesSerializerProvider;
  }

  @Override
  public DataStore<UserPreferences> get() {
    return providesUserPreferencesDataStore$datastore(contextProvider.get(), ioDispatcherProvider.get(), scopeProvider.get(), userPreferencesSerializerProvider.get());
  }

  public static DataStoreModule_ProvidesUserPreferencesDataStore$datastoreFactory create(
      Provider<Context> contextProvider, Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CoroutineScope> scopeProvider,
      Provider<UserPreferencesSerializer> userPreferencesSerializerProvider) {
    return new DataStoreModule_ProvidesUserPreferencesDataStore$datastoreFactory(contextProvider, ioDispatcherProvider, scopeProvider, userPreferencesSerializerProvider);
  }

  public static DataStore<UserPreferences> providesUserPreferencesDataStore$datastore(
      Context context, CoroutineDispatcher ioDispatcher, CoroutineScope scope,
      UserPreferencesSerializer userPreferencesSerializer) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.providesUserPreferencesDataStore$datastore(context, ioDispatcher, scope, userPreferencesSerializer));
  }
}
