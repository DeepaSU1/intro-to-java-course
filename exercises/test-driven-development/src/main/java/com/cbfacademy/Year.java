
package com.cbfacademy;

public class Year {
    private final Integer year;

    public Year(Integer year){
        this.year = year;
    }
    public boolean isLeap(){
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return (year % 4 == 0);
    }
}
