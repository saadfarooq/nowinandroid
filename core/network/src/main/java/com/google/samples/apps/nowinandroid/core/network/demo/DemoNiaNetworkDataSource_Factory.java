package com.google.samples.apps.nowinandroid.core.network.demo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;

@ScopeMetadata
@QualifierMetadata("com.google.samples.apps.nowinandroid.core.common.network.Dispatcher")
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
public final class DemoNiaNetworkDataSource_Factory implements Factory<DemoNiaNetworkDataSource> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<Json> networkJsonProvider;

  private final Provider<DemoAssetManager> assetsProvider;

  private DemoNiaNetworkDataSource_Factory(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<Json> networkJsonProvider, Provider<DemoAssetManager> assetsProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.networkJsonProvider = networkJsonProvider;
    this.assetsProvider = assetsProvider;
  }

  @Override
  public DemoNiaNetworkDataSource get() {
    return newInstance(ioDispatcherProvider.get(), networkJsonProvider.get(), assetsProvider.get());
  }

  public static DemoNiaNetworkDataSource_Factory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider, Provider<Json> networkJsonProvider,
      Provider<DemoAssetManager> assetsProvider) {
    return new DemoNiaNetworkDataSource_Factory(ioDispatcherProvider, networkJsonProvider, assetsProvider);
  }

  public static DemoNiaNetworkDataSource newInstance(CoroutineDispatcher ioDispatcher,
      Json networkJson, DemoAssetManager assets) {
    return new DemoNiaNetworkDataSource(ioDispatcher, networkJson, assets);
  }
}
