package com.example.randa.azanapp.service;

import com.example.randa.azanapp.model.TimeResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Randa on 8/5/2017.
 */

public interface PrayerTimeService {
    @GET("/timingsByCity")
    Observable<TimeResponse>getPrayerTime(@Query("city") String city,
                                          @Query("country") String country);
}
