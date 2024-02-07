package com.ojiraffers.test;

public class Practice02 {

    public static void main(String[] args) {

        int x=50000;
        method(x);

    }

    public static void method(int x){

        int money = (int)(x * Math.pow(1.03,24));

        System.out.println(money);

    }

}
