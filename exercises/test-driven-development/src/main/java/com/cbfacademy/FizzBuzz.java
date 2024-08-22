
package com.cbfacademy;

public class FizzBuzz {

    // static String of(Integer number) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
    
    public static String of(Integer number) {
         if (number % 15 == 0) return "FizzBuzz";
        if (number %3 == 0) {
            return "Fizz";
        } if (number % 5 == 0) return "Buzz";
       
        return number.toString();
    }

//     static String of(Integer number) {
//         throw new UnsupportedOperationException("Not supported yet.");
//     }
 }