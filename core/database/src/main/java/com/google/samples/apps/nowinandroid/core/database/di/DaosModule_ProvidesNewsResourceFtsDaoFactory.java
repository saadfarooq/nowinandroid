package com.google.samples.apps.nowinandroid.core.database.di;

import com.google.samples.apps.nowinandroid.core.database.NiaDatabase;
import com.google.samples.apps.nowinandroid.core.database.dao.NewsResourceFtsDao;
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
public final class DaosModule_ProvidesNewsResourceFtsDaoFactory implements Factory<NewsResourceFtsDao> {
  private final Provider<NiaDatabase> databaseProvider;

  private DaosModule_ProvidesNewsResourceFtsDaoFactory(Provider<NiaDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public NewsResourceFtsDao get() {
    return providesNewsResourceFtsDao(databaseProvider.get());
  }

  public static DaosModule_ProvidesNewsResourceFtsDaoFactory create(
      Provider<NiaDatabase> databaseProvider) {
    return new DaosModule_ProvidesNewsResourceFtsDaoFactory(databaseProvider);
  }

  public static NewsResourceFtsDao providesNewsResourceFtsDao(NiaDatabase database) {
    return Preconditions.checkNotNullFromProvides(DaosModule.INSTANCE.providesNewsResourceFtsDao(database));
  }
}
