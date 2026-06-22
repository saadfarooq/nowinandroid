package com.google.samples.apps.nowinandroid.core.network.retrofit;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.serialization.json.Json;
import okhttp3.Call;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RetrofitNiaNetwork_Factory implements Factory<RetrofitNiaNetwork> {
  private final Provider<Json> networkJsonProvider;

  private final Provider<Call.Factory> okhttpCallFactoryProvider;

  private RetrofitNiaNetwork_Factory(Provider<Json> networkJsonProvider,
      Provider<Call.Factory> okhttpCallFactoryProvider) {
    this.networkJsonProvider = networkJsonProvider;
    this.okhttpCallFactoryProvider = okhttpCallFactoryProvider;
  }

  @Override
  public RetrofitNiaNetwork get() {
    return newInstance(networkJsonProvider.get(), DoubleCheck.lazy(okhttpCallFactoryProvider));
  }

  public static RetrofitNiaNetwork_Factory create(Provider<Json> networkJsonProvider,
      Provider<Call.Factory> okhttpCallFactoryProvider) {
    return new RetrofitNiaNetwork_Factory(networkJsonProvider, okhttpCallFactoryProvider);
  }

  public static RetrofitNiaNetwork newInstance(Json networkJson,
      Lazy<Call.Factory> okhttpCallFactory) {
    return new RetrofitNiaNetwork(networkJson, okhttpCallFactory);
  }
}
