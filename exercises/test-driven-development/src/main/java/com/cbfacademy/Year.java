
package com.cbfacademy;

public class Year {
    public boolean isLeap(int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
