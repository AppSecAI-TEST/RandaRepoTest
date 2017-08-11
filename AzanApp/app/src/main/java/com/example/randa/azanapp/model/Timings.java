package com.example.randa.azanapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Randa on 8/5/2017.
 */

public class Timings {
    @SerializedName("Fajr")
    @Expose
    private String fajr;
    @SerializedName("Sunrise")
    @Expose
    private String sunrise;
    @SerializedName("Dhuhr")
    @Expose
    private String duhr;
    @SerializedName("Asr")
    @Expose
    private String asr;
    @SerializedName("Maghrib")
    @Expose
    private String maghrib;
    @SerializedName("Isha")
    @Expose
    private String isha;

    public String getFajr() {
        return fajr;
    }

    public void setFajr(String fajr) {
        this.fajr = fajr;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getDuhr() {
        return duhr;
    }

    public void setDuhr(String duhr) {
        this.duhr = duhr;
    }

    public String getAsr() {
        return asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsha() {
        return isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Timings timings = (Timings) o;

        if (fajr != null ? !fajr.equals(timings.fajr) : timings.fajr != null) return false;
        if (sunrise != null ? !sunrise.equals(timings.sunrise) : timings.sunrise != null)
            return false;
        if (duhr != null ? !duhr.equals(timings.duhr) : timings.duhr != null) return false;
        if (asr != null ? !asr.equals(timings.asr) : timings.asr != null) return false;
        if (maghrib != null ? !maghrib.equals(timings.maghrib) : timings.maghrib != null)
            return false;
        return isha != null ? isha.equals(timings.isha) : timings.isha == null;
    }

    @Override
    public int hashCode() {
        int result = fajr != null ? fajr.hashCode() : 0;
        result = 31 * result + (sunrise != null ? sunrise.hashCode() : 0);
        result = 31 * result + (duhr != null ? duhr.hashCode() : 0);
        result = 31 * result + (asr != null ? asr.hashCode() : 0);
        result = 31 * result + (maghrib != null ? maghrib.hashCode() : 0);
        result = 31 * result + (isha != null ? isha.hashCode() : 0);
        return result;
    }
}
