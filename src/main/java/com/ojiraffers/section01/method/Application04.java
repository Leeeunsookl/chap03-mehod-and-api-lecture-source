package com.ojiraffers.section01.method;

public class Application04 {

    private static Object app4;

    public static void main(String[] args) {

        /* 수업목표. 여러 개의 전달 인자를 이용한 메소드를 호출할 수 있다. */
        /*필기.
        *  여러 개의 전달인자를 이용한 메소드 호출 테스트
        *   */

        Application04 app4 = new Application04();
        app4.testMethod("이은숙", 15, '여');        //.은 초기화 세팅할 때 쓰고 띄어쓰기는 불러올 때 씀

        }

    public void testMethod(String name, int age, final char gender){

        /* 필기.
        *   매개변수도 일종의 지역변수로 분류된다.
        *   매개변수 역시 final 사용 가능.
        *   지역변수에 final 키워드 붙여 상수 만드는 것과 동일.
        *   */

        System.out.println("나의 이름은 "+ name + "이고, 나이는 "+ age +" 세 이며, 성별은 " + gender + "입니다.");


    }


}
