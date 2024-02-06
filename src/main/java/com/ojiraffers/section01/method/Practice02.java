package com.ojiraffers.section01.method;

public class Practice02 {
    public static void main(String[] args) {
        Practice02 p2 = new Practice02();
        p2.m1(5730 );
        p2.talk("안녕하세요");
        p2.abc(300);
//        p1.talk( );
    }
//    public void talk(String a){
//        System.out.println("Hello " + a);
//    }

    public void abc(int plus){
        System.out.println("나는"+plus+"주를 갖고 있다.");
    }
    public void talk(String hello){
        System.out.println(hello);
    }

    public void m1(int second){
        int minute = second/60;
        int sec_01 = second%60;
        int hour = minute/60;
        int min_01 = minute%60;

        System.out.println("시간: " + hour + " 분: " + min_01 + "초: " + sec_01);


    }
}
