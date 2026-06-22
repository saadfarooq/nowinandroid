package com.google.samples.apps.nowinandroid.feature.topic.impl;

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
public final class TopicViewModel_Factory_Impl implements TopicViewModel.Factory {
  private final TopicViewModel_Factory delegateFactory;

  TopicViewModel_Factory_Impl(TopicViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public TopicViewModel create(String topicId) {
    return delegateFactory.get(topicId);
  }

  public static Provider<TopicViewModel.Factory> create(TopicViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new TopicViewModel_Factory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<TopicViewModel.Factory> createFactoryProvider(
      TopicViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new TopicViewModel_Factory_Impl(delegateFactory));
  }
}
