package com.ojiraffers.test;

public class Practice01 {
    public static void main(String[] args) {

        int radius = 123;
        method(radius);

    }

    public static void method (int radius){


        System.out.println("원의 넓이?" + (int) (Math.PI*(radius*radius)));

    }

}
