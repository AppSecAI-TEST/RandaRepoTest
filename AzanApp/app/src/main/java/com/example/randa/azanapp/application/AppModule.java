package com.example.randa.azanapp.application;

import android.app.Application;

import com.example.randa.azanapp.service.PrayerTimeService;
import com.example.randa.azanapp.service.RetrofitFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Randa on 8/5/2017.
 */
@Module(includes = {ViewModelModule.class})
public class AppModule {
    private Application app;

    public AppModule(Application app) {
        this.app = app;
    }
    @Provides
    @Singleton
    PrayerTimeService providePrayerService() {
        return RetrofitFactory.createService(PrayerTimeService.class, " http://api.aladhan.com");
    }


}
