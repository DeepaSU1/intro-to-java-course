
package com.cbfacademy;

public class Arrays {
    public static void main(String[] args){
        int[] intArr = {12,24,14,23,64,14,63,54};
        float[] floatArr = {1f,2f,3f,4f,5f,6f,7f,8f,9f,10f,11f,12f};
        double[] doubleArr = new double[5];
        doubleArr[0] = 1d;
        doubleArr[1] = 2d;
        doubleArr[2] = 3d;
        doubleArr[3] = 4d;
        doubleArr[4] = 5d;
        boolean[] booleanArr = {true,false,false,true,false,true};
        System.out.println(intArr[4]);
        System.out.println(floatArr[4]);
        System.out.println(doubleArr[4]);
        System.out.println(booleanArr[4]);
    }
}