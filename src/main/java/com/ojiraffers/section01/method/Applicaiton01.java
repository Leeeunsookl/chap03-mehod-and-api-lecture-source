package com.ojiraffers.section01.method;

public class Applicaiton01 {

    public static void main(String[] args) {

    /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다. */
    /* 필기.
    *   메소드란?
    *   메소드(method) 는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
    *   */

        System.out.println("main() 메소드 시작됨...");

        /* 목차. 1. 작성한 메소드를 호출하는 부분을 작성한다. */
        /* 필기.
        *   메소드 호출 방법
        *   클래스명 사용할 이름 = new 클래스명();
        *   사용할 이름.메소드명();
        *   */

        Applicaiton01 app1= new Applicaiton01();     //new=할당 연산자, app1이란 공간안에 어플리케이션01이 다 들어간다는 거
        app1.methodA();     //main 바깥에 있는 methodA를 불러온 것임
//        app1.methodB();

        System.out.println("main() 메소드 종료됨...");

    }

    public void methodA() {

        System.out.println("method() 등장~");

        methodB();

        System.out.println("method() 퇴장~");

    }
    public void methodB(){

        System.out.println("methodB() 등장!");

//        methodA();        //순환참조 methodA,B가 서로를 호출하기 때문에 계속 쌓이다가 터짐!

        System.out.println("methodB() 퇴장!");

    }


}
