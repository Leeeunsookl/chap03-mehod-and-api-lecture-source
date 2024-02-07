package com.ojiraffers.test;

public class Application01 {

    public static void main(String[] args) {


        /* 수업목표. 메소드의 호출 흐름을 연출해보자 */
        System.out.println("시작");

        Application01 app1 = new Application01();
        app1.testMethod1();

        System.out.println("끝");
    }

    public void testMethod1(){

        System.out.println("안녕 나는 Method1");

        testMethod02();

        System.out.println("1번도 이만 가볼게");

    }

    public void testMethod02(){     //void는 자신의 코드를 실행하고 나서 불렀던 쪽으로 다시 돌아감

        System.out.println("나는 Method2");

//        System.out.println(testMethod3());    값 자체를 출력문에 넣어서 출력을 한 상태
        String hi = testMethod3();
//        System.out.println("hi"+ hi);     값을 변수 공간에 담아서 출력을 한 상태

        System.out.println("2번은 이만 가볼게");

    }

    public String testMethod3(){
//    public int testMethod3(){ String 타입을 int 로 집어넣으면 오류가 뜬다

        System.out.println();

        return "안녕 불렀어?";

//        void 구문이 아니면 꼭 return 을 써줘야 한다.
    }


}
