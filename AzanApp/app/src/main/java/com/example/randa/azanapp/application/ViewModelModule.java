package com.example.randa.azanapp.application;

import com.example.randa.azanapp.service.PrayerTimeService;
import com.example.randa.azanapp.viewModel.PrayerViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Randa on 8/5/2017.
 */
@Module
public class ViewModelModule {
    @Provides
    @Singleton
    PrayerViewModel providePrayerViewModel(PrayerTimeService service) {
        return new PrayerViewModel(service);
    }

}
