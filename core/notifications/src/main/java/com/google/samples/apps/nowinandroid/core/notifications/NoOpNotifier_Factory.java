package com.google.samples.apps.nowinandroid.core.notifications;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class NoOpNotifier_Factory implements Factory<NoOpNotifier> {
  @Override
  public NoOpNotifier get() {
    return newInstance();
  }

  public static NoOpNotifier_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NoOpNotifier newInstance() {
    return new NoOpNotifier();
  }

  private static final class InstanceHolder {
    static final NoOpNotifier_Factory INSTANCE = new NoOpNotifier_Factory();
  }
}
