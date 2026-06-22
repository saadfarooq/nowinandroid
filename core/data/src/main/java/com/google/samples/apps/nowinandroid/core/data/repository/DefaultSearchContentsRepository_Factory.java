package com.google.samples.apps.nowinandroid.core.data.repository;

import com.google.samples.apps.nowinandroid.core.database.dao.NewsResourceDao;
import com.google.samples.apps.nowinandroid.core.database.dao.NewsResourceFtsDao;
import com.google.samples.apps.nowinandroid.core.database.dao.TopicDao;
import com.google.samples.apps.nowinandroid.core.database.dao.TopicFtsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

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
public final class DefaultSearchContentsRepository_Factory implements Factory<DefaultSearchContentsRepository> {
  private final Provider<NewsResourceDao> newsResourceDaoProvider;

  private final Provider<NewsResourceFtsDao> newsResourceFtsDaoProvider;

  private final Provider<TopicDao> topicDaoProvider;

  private final Provider<TopicFtsDao> topicFtsDaoProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private DefaultSearchContentsRepository_Factory(Provider<NewsResourceDao> newsResourceDaoProvider,
      Provider<NewsResourceFtsDao> newsResourceFtsDaoProvider, Provider<TopicDao> topicDaoProvider,
      Provider<TopicFtsDao> topicFtsDaoProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.newsResourceDaoProvider = newsResourceDaoProvider;
    this.newsResourceFtsDaoProvider = newsResourceFtsDaoProvider;
    this.topicDaoProvider = topicDaoProvider;
    this.topicFtsDaoProvider = topicFtsDaoProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public DefaultSearchContentsRepository get() {
    return newInstance(newsResourceDaoProvider.get(), newsResourceFtsDaoProvider.get(), topicDaoProvider.get(), topicFtsDaoProvider.get(), ioDispatcherProvider.get());
  }

  public static DefaultSearchContentsRepository_Factory create(
      Provider<NewsResourceDao> newsResourceDaoProvider,
      Provider<NewsResourceFtsDao> newsResourceFtsDaoProvider, Provider<TopicDao> topicDaoProvider,
      Provider<TopicFtsDao> topicFtsDaoProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new DefaultSearchContentsRepository_Factory(newsResourceDaoProvider, newsResourceFtsDaoProvider, topicDaoProvider, topicFtsDaoProvider, ioDispatcherProvider);
  }

  public static DefaultSearchContentsRepository newInstance(NewsResourceDao newsResourceDao,
      NewsResourceFtsDao newsResourceFtsDao, TopicDao topicDao, TopicFtsDao topicFtsDao,
      CoroutineDispatcher ioDispatcher) {
    return new DefaultSearchContentsRepository(newsResourceDao, newsResourceFtsDao, topicDao, topicFtsDao, ioDispatcher);
  }
}
