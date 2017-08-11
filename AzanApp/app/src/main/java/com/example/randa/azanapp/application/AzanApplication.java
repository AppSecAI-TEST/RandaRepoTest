package com.example.randa.azanapp.application;

import android.app.Application;

/**
 * Created by Randa on 8/5/2017.
 */

public class AzanApplication extends Application {
    private  AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}
