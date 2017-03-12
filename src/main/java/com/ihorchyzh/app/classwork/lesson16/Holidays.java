package com.ihorchyzh.app.classwork.lesson16;

/**
 * Created by ihorchyzh on 3/9/17.
 */
public enum Holidays {

    NEW_YEAR(1, "January", "New Year"),
    WOMENS_DAY(8, "March", "Womens Day"),
    CONSTITUTION_DAY(28, "June", "Constitution Day");

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getHoliday() {
        return holiday;
    }

    private int day;
    private String month;
    private String holiday;

    Holidays(int day, String month, String holiday) {
        this.day = day;
        this.month = month;
        this.holiday = holiday;
    }




}
