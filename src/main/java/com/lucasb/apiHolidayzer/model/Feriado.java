package com.lucasb.apiHolidayzer.model;

public class Feriado {
    String date;
    String holidayName;

    public Feriado(String date, String holidayName) {
        this.date = date;
        this.holidayName = holidayName;
    }

    public Feriado(){}

    public String getDate() {
        return date;
    }



    public void setDate(String date) {
        this.date = date;
    }



    public String getHolidayName() {
        return holidayName;
    }



    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }



    @Override
    public String toString() {
        return "Holidayzer [date=" + date + ", holidayName=" + holidayName + "]";
    }

}

