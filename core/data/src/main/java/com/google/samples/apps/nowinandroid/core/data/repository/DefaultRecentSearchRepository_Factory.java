package com.google.samples.apps.nowinandroid.core.data.repository;

import com.google.samples.apps.nowinandroid.core.database.dao.RecentSearchQueryDao;
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
public final class DefaultRecentSearchRepository_Factory implements Factory<DefaultRecentSearchRepository> {
  private final Provider<RecentSearchQueryDao> recentSearchQueryDaoProvider;

  private DefaultRecentSearchRepository_Factory(
      Provider<RecentSearchQueryDao> recentSearchQueryDaoProvider) {
    this.recentSearchQueryDaoProvider = recentSearchQueryDaoProvider;
  }

  @Override
  public DefaultRecentSearchRepository get() {
    return newInstance(recentSearchQueryDaoProvider.get());
  }

  public static DefaultRecentSearchRepository_Factory create(
      Provider<RecentSearchQueryDao> recentSearchQueryDaoProvider) {
    return new DefaultRecentSearchRepository_Factory(recentSearchQueryDaoProvider);
  }

  public static DefaultRecentSearchRepository newInstance(
      RecentSearchQueryDao recentSearchQueryDao) {
    return new DefaultRecentSearchRepository(recentSearchQueryDao);
  }
}
