package com.google.samples.apps.nowinandroid.core.database.di;

import com.google.samples.apps.nowinandroid.core.database.NiaDatabase;
import com.google.samples.apps.nowinandroid.core.database.dao.RecentSearchQueryDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DaosModule_ProvidesRecentSearchQueryDaoFactory implements Factory<RecentSearchQueryDao> {
  private final Provider<NiaDatabase> databaseProvider;

  private DaosModule_ProvidesRecentSearchQueryDaoFactory(Provider<NiaDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RecentSearchQueryDao get() {
    return providesRecentSearchQueryDao(databaseProvider.get());
  }

  public static DaosModule_ProvidesRecentSearchQueryDaoFactory create(
      Provider<NiaDatabase> databaseProvider) {
    return new DaosModule_ProvidesRecentSearchQueryDaoFactory(databaseProvider);
  }

  public static RecentSearchQueryDao providesRecentSearchQueryDao(NiaDatabase database) {
    return Preconditions.checkNotNullFromProvides(DaosModule.INSTANCE.providesRecentSearchQueryDao(database));
  }
}
