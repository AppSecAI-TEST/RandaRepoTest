package com.example.randa.azanapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Randa on 8/5/2017.
 */

public class TimeResponse extends BaseResponse {
    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TimeResponse that = (TimeResponse) o;

        return data != null ? data.equals(that.data) : that.data == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    public class Data {
        @SerializedName("timings")
        @Expose
        private Timings timings;

        public Timings getTimings() {
            return timings;
        }

        public void setTimings(Timings timings) {
            this.timings = timings;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data = (Data) o;

            return timings != null ? timings.equals(data.timings) : data.timings == null;
        }

        @Override
        public int hashCode() {
            return timings != null ? timings.hashCode() : 0;
        }
    }
}
