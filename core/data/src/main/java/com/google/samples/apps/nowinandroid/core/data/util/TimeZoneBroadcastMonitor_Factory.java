package com.google.samples.apps.nowinandroid.core.data.util;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "dagger.hilt.android.qualifiers.ApplicationContext",
    "com.google.samples.apps.nowinandroid.core.common.network.di.ApplicationScope",
    "com.google.samples.apps.nowinandroid.core.common.network.Dispatcher"
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
public final class TimeZoneBroadcastMonitor_Factory implements Factory<TimeZoneBroadcastMonitor> {
  private final Provider<Context> contextProvider;

  private final Provider<CoroutineScope> appScopeProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private TimeZoneBroadcastMonitor_Factory(Provider<Context> contextProvider,
      Provider<CoroutineScope> appScopeProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.contextProvider = contextProvider;
    this.appScopeProvider = appScopeProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public TimeZoneBroadcastMonitor get() {
    return newInstance(contextProvider.get(), appScopeProvider.get(), ioDispatcherProvider.get());
  }

  public static TimeZoneBroadcastMonitor_Factory create(Provider<Context> contextProvider,
      Provider<CoroutineScope> appScopeProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new TimeZoneBroadcastMonitor_Factory(contextProvider, appScopeProvider, ioDispatcherProvider);
  }

  public static TimeZoneBroadcastMonitor newInstance(Context context, CoroutineScope appScope,
      CoroutineDispatcher ioDispatcher) {
    return new TimeZoneBroadcastMonitor(context, appScope, ioDispatcher);
  }
}
