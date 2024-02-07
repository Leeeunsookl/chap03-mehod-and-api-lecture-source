package com.ojiraffers.test;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("main 시작");

        Application02 app2 = new Application02();
        app2.testMethod1(100);
        app2.testMethod2(200);
        System.out.println("나는 testMethod2" );

        app2.testMethod3("이은숙",15,'여');

        System.out.println("main 마무리");


    }

    public void testMethod1(int num){

        System.out.println(++num);

    }

    public int testMethod2(int num2){

        return num2;
    }

    public void testMethod3(String name,int age, char gender){

        System.out.println("내 이름은 "+name+(",나이는 ")+age + ",성별은 " +gender);

    }


}
