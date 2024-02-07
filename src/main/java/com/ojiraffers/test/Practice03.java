package com.ojiraffers.test;

public class Practice03 {

    public static void main(String[] args) {

        int bet = 81234567;
        method(bet);

    }

    public static void method(int bet){

        long money= ((long)bet*35);
        int c=(int)(money%1000);

//        System.out.println(money);
//        System.out.println(c);

        money /= 1000;
        long b = money%1000;
//        System.out.println(b);

        money/= 1000;
        long a = money%1000;
//        System.out.println(a);

        money/= 1000;
        long d = money%1000;
//        System.out.println(d);

        System.out.println(d+","+c+","+b+","+a);




    }

}
