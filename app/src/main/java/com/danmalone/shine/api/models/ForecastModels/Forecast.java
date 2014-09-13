
package com.danmalone.shine.api.models.ForecastModels;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;


public class Forecast {

    @Expose
    private String cod;
    @Expose
    private Double message;
    @Expose
    private City city;
    @Expose
    private Integer cnt;
    @Expose
    private java.util.List<DetailedForecast> list = new ArrayList<DetailedForecast>();

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public java.util.List<DetailedForecast> getList() {
        return list;
    }

    public void setList(java.util.List<DetailedForecast> list) {
        this.list = list;
    }

}