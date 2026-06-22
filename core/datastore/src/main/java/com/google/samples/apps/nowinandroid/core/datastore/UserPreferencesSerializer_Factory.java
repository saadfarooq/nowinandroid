package com.google.samples.apps.nowinandroid.core.datastore;

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
public final class UserPreferencesSerializer_Factory implements Factory<UserPreferencesSerializer> {
  @Override
  public UserPreferencesSerializer get() {
    return newInstance();
  }

  public static UserPreferencesSerializer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserPreferencesSerializer newInstance() {
    return new UserPreferencesSerializer();
  }

  private static final class InstanceHolder {
    static final UserPreferencesSerializer_Factory INSTANCE = new UserPreferencesSerializer_Factory();
  }
}
