package com.example.randa.azanapp.application;

import com.example.randa.azanapp.view.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Randa on 8/5/2017.
 */
@Singleton
@Component(modules = {AppModule.class, ViewModelModule.class})
public interface AppComponent {
    void inject(AzanApplication app);
    void inject(HomeActivity activity);
}
