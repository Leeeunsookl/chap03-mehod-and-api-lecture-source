package com.ojiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {        //static 붙은 걸  먼저 찾는다. 재사용 필요할 때 유리. 붙지 않은 것은 그 때서야 공간이 생성됨.

        /* 수업목표. static 메소드를 호출할 수 있다.
        *   필기.
        *    static 메소드 호출
        *   */

        /* 필기.
        *   static 메소드 호출하는 방법
        *   클래스명, 메소드명() < - 이런 방식으로 호출한다.
        *   */

        System.out.println("10과 20의 합" + Application08.sumTwoNumbers(10,20));

        /*필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다. */
        System.out.println("20과 30의 합" + sumTwoNumbers(20,30));
        System.out.println("1111과 28의 합" + sumTwoNumbers(1111,28));

    }

    public static int sumTwoNumbers(int first, int second){

        return first + second;      //메소드 생성해놨기 때문에
    }

}
