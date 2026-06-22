package com.google.samples.apps.nowinandroid.core.database.di;

import com.google.samples.apps.nowinandroid.core.database.NiaDatabase;
import com.google.samples.apps.nowinandroid.core.database.dao.TopicDao;
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
public final class DaosModule_ProvidesTopicsDaoFactory implements Factory<TopicDao> {
  private final Provider<NiaDatabase> databaseProvider;

  private DaosModule_ProvidesTopicsDaoFactory(Provider<NiaDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public TopicDao get() {
    return providesTopicsDao(databaseProvider.get());
  }

  public static DaosModule_ProvidesTopicsDaoFactory create(Provider<NiaDatabase> databaseProvider) {
    return new DaosModule_ProvidesTopicsDaoFactory(databaseProvider);
  }

  public static TopicDao providesTopicsDao(NiaDatabase database) {
    return Preconditions.checkNotNullFromProvides(DaosModule.INSTANCE.providesTopicsDao(database));
  }
}
