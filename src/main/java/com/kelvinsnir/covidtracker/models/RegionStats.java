package com.kelvinsnir.covidtracker.models;

public class RegionStats {
    private String state;
    private String country;
    private int currentTotalCases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCurrentTotalCases() {
        return currentTotalCases;
    }

    public void setCurrentTotalCases(int currentTotalCases) {
        this.currentTotalCases = currentTotalCases;
    }

    @Override
    public String toString() {
        return "RegionStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", currentTotalCases=" + currentTotalCases +
                '}';
    }
}
