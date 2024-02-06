package com.ojiraffers.section01.method;

public class Calculator {

    public int minNumberOf(int first, int second) {

        return (first > second) ? second : first;


    }

    /* 필기.
     *   다른 클래스에 작성한 메소드 호출  */

    public static int maxNumberOf(int first, int second) {

        return (first > second) ? first : second;
    }
}



