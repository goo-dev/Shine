
package com.danmalone.shine.api.models.DailyModels;

import com.google.gson.annotations.Expose;

public class Coord {

    @Expose
    private Double lon;
    @Expose
    private Double lat;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

}
