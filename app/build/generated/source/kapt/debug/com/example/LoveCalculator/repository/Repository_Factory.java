// Generated by Dagger (https://dagger.dev).
package com.example.LoveCalculator.repository;

import com.example.LoveCalculator.network.LoveApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<LoveApi> apiProvider;

  public Repository_Factory(Provider<LoveApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public Repository get() {
    return newInstance(apiProvider.get());
  }

  public static Repository_Factory create(Provider<LoveApi> apiProvider) {
    return new Repository_Factory(apiProvider);
  }

  public static Repository newInstance(LoveApi api) {
    return new Repository(api);
  }
}
