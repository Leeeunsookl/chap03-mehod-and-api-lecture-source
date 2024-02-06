package com.ojiraffers.section01.method;

public class Practice03 {
//
    public static void main(String[] args) {
        Practice03 p3 = new Practice03();
        p3.total(430);
        ;




    }

    public void total(int x){
            int total=x;
            int a500 = total/500;
            total = total%500;
            int a100 = total/100;
            total = total %100;
            int a50 =  total / 50;
            total =  total % 50;
            total = total/10;
            int a10= total % 10;

            int sum = a500+a100+a50+a10;

        System.out.println("총 갯수는"+ sum +"이다.");
    }


}
