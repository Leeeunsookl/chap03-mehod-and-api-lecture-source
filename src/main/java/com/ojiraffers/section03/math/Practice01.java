package com.ojiraffers.section03.math;

public class Practice01 {

    public static void main(String[] args) {

        /* 1. x 초가 주어졌을때 (x 는 항상 3600보다 크다.)  a 시간 b 분 c 초 로 변환하여 출력해라.*/
        Practice01 p1= new Practice01();
        p1.clock(3700);

    }
    public void clock(int total){
        int min = total/60;
        int second = total%60;
        int hour = min/60;
        int minute = min%60;
        // 시간을 구하려면 먼저 분을 정의하고, int 분의 나머지는 초가 되고, 시간은 min을 60으로 나누면 된다. 당연히 분의 나머지 mod를 하면 그게 진짜 분이 된다.
        System.out.println( hour + "시간 "+ minute + "분 " + second + "초 " );
        int random1 = (int)(Math.random()*114)-35;



        /* 2. -35부터 78까지의 난수를 생성하는 메소드를 구현해라.*/
        System.out.println("random1 = " + random1);


    }



}
