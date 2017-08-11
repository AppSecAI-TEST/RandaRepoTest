package com.example.randa.azanapp.viewModel;

import com.example.randa.azanapp.model.TimeResponse;
import com.example.randa.azanapp.service.PrayerTimeService;


import javax.inject.Inject;

import rx.Observable;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by Randa on 8/5/2017.
 */

public class PrayerViewModel {
    PrayerTimeService service;

    @Inject
    public PrayerViewModel(PrayerTimeService service) {
        this.service = service;
    }

    public Observable<TimeResponse> getPrayerTime(String city, String country) {
        return service.getPrayerTime(city, country).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
