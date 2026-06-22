package com.google.samples.apps.nowinandroid.core.database.di;

import android.content.Context;
import com.google.samples.apps.nowinandroid.core.database.NiaDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseModule_ProvidesNiaDatabaseFactory implements Factory<NiaDatabase> {
  private final Provider<Context> contextProvider;

  private DatabaseModule_ProvidesNiaDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NiaDatabase get() {
    return providesNiaDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvidesNiaDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvidesNiaDatabaseFactory(contextProvider);
  }

  public static NiaDatabase providesNiaDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providesNiaDatabase(context));
  }
}
