package com.google.samples.apps.nowinandroid.core.network.di;

import android.content.Context;
import com.google.samples.apps.nowinandroid.core.network.demo.DemoAssetManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class NetworkModule_ProvidesDemoAssetManagerFactory implements Factory<DemoAssetManager> {
  private final Provider<Context> contextProvider;

  private NetworkModule_ProvidesDemoAssetManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DemoAssetManager get() {
    return providesDemoAssetManager(contextProvider.get());
  }

  public static NetworkModule_ProvidesDemoAssetManagerFactory create(
      Provider<Context> contextProvider) {
    return new NetworkModule_ProvidesDemoAssetManagerFactory(contextProvider);
  }

  public static DemoAssetManager providesDemoAssetManager(Context context) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesDemoAssetManager(context));
  }
}
