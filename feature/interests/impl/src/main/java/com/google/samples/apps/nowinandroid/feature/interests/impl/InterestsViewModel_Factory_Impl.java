package com.google.samples.apps.nowinandroid.feature.interests.impl;

import com.google.samples.apps.nowinandroid.feature.interests.api.navigation.InterestsNavKey;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class InterestsViewModel_Factory_Impl implements InterestsViewModel.Factory {
  private final InterestsViewModel_Factory delegateFactory;

  InterestsViewModel_Factory_Impl(InterestsViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public InterestsViewModel create(InterestsNavKey key) {
    return delegateFactory.get(key);
  }

  public static Provider<InterestsViewModel.Factory> create(
      InterestsViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new InterestsViewModel_Factory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<InterestsViewModel.Factory> createFactoryProvider(
      InterestsViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new InterestsViewModel_Factory_Impl(delegateFactory));
  }
}
