package com.google.samples.apps.nowinandroid.core.data.repository;

import com.google.samples.apps.nowinandroid.core.database.dao.TopicDao;
import com.google.samples.apps.nowinandroid.core.network.NiaNetworkDataSource;
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
public final class OfflineFirstTopicsRepository_Factory implements Factory<OfflineFirstTopicsRepository> {
  private final Provider<TopicDao> topicDaoProvider;

  private final Provider<NiaNetworkDataSource> networkProvider;

  private OfflineFirstTopicsRepository_Factory(Provider<TopicDao> topicDaoProvider,
      Provider<NiaNetworkDataSource> networkProvider) {
    this.topicDaoProvider = topicDaoProvider;
    this.networkProvider = networkProvider;
  }

  @Override
  public OfflineFirstTopicsRepository get() {
    return newInstance(topicDaoProvider.get(), networkProvider.get());
  }

  public static OfflineFirstTopicsRepository_Factory create(Provider<TopicDao> topicDaoProvider,
      Provider<NiaNetworkDataSource> networkProvider) {
    return new OfflineFirstTopicsRepository_Factory(topicDaoProvider, networkProvider);
  }

  public static OfflineFirstTopicsRepository newInstance(TopicDao topicDao,
      NiaNetworkDataSource network) {
    return new OfflineFirstTopicsRepository(topicDao, network);
  }
}
