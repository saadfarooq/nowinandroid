package com.google.samples.apps.nowinandroid.core.data.repository;

import com.google.samples.apps.nowinandroid.core.database.dao.NewsResourceDao;
import com.google.samples.apps.nowinandroid.core.database.dao.TopicDao;
import com.google.samples.apps.nowinandroid.core.datastore.NiaPreferencesDataSource;
import com.google.samples.apps.nowinandroid.core.network.NiaNetworkDataSource;
import com.google.samples.apps.nowinandroid.core.notifications.Notifier;
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
public final class OfflineFirstNewsRepository_Factory implements Factory<OfflineFirstNewsRepository> {
  private final Provider<NiaPreferencesDataSource> niaPreferencesDataSourceProvider;

  private final Provider<NewsResourceDao> newsResourceDaoProvider;

  private final Provider<TopicDao> topicDaoProvider;

  private final Provider<NiaNetworkDataSource> networkProvider;

  private final Provider<Notifier> notifierProvider;

  private OfflineFirstNewsRepository_Factory(
      Provider<NiaPreferencesDataSource> niaPreferencesDataSourceProvider,
      Provider<NewsResourceDao> newsResourceDaoProvider, Provider<TopicDao> topicDaoProvider,
      Provider<NiaNetworkDataSource> networkProvider, Provider<Notifier> notifierProvider) {
    this.niaPreferencesDataSourceProvider = niaPreferencesDataSourceProvider;
    this.newsResourceDaoProvider = newsResourceDaoProvider;
    this.topicDaoProvider = topicDaoProvider;
    this.networkProvider = networkProvider;
    this.notifierProvider = notifierProvider;
  }

  @Override
  public OfflineFirstNewsRepository get() {
    return newInstance(niaPreferencesDataSourceProvider.get(), newsResourceDaoProvider.get(), topicDaoProvider.get(), networkProvider.get(), notifierProvider.get());
  }

  public static OfflineFirstNewsRepository_Factory create(
      Provider<NiaPreferencesDataSource> niaPreferencesDataSourceProvider,
      Provider<NewsResourceDao> newsResourceDaoProvider, Provider<TopicDao> topicDaoProvider,
      Provider<NiaNetworkDataSource> networkProvider, Provider<Notifier> notifierProvider) {
    return new OfflineFirstNewsRepository_Factory(niaPreferencesDataSourceProvider, newsResourceDaoProvider, topicDaoProvider, networkProvider, notifierProvider);
  }

  public static OfflineFirstNewsRepository newInstance(
      NiaPreferencesDataSource niaPreferencesDataSource, NewsResourceDao newsResourceDao,
      TopicDao topicDao, NiaNetworkDataSource network, Notifier notifier) {
    return new OfflineFirstNewsRepository(niaPreferencesDataSource, newsResourceDao, topicDao, network, notifier);
  }
}
