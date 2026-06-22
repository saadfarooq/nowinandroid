package com.google.samples.apps.nowinandroid.core.database.di;

import com.google.samples.apps.nowinandroid.core.database.NiaDatabase;
import com.google.samples.apps.nowinandroid.core.database.dao.TopicFtsDao;
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
public final class DaosModule_ProvidesTopicFtsDaoFactory implements Factory<TopicFtsDao> {
  private final Provider<NiaDatabase> databaseProvider;

  private DaosModule_ProvidesTopicFtsDaoFactory(Provider<NiaDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public TopicFtsDao get() {
    return providesTopicFtsDao(databaseProvider.get());
  }

  public static DaosModule_ProvidesTopicFtsDaoFactory create(
      Provider<NiaDatabase> databaseProvider) {
    return new DaosModule_ProvidesTopicFtsDaoFactory(databaseProvider);
  }

  public static TopicFtsDao providesTopicFtsDao(NiaDatabase database) {
    return Preconditions.checkNotNullFromProvides(DaosModule.INSTANCE.providesTopicFtsDao(database));
  }
}
