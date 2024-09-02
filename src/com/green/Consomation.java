package com.green;


import java.time.LocalDate;

public class Consomation {
    private int value;
    private LocalDate startdate;
    private LocalDate enddate;

    public Consomation(int value, LocalDate startdate, LocalDate enddate){
        this.value = value;
        this.startdate = startdate;
        this.enddate = enddate;
    }
    public int getValue() {
        return value;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

}
