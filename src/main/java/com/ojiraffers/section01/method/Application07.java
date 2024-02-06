package com.ojiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
        /* 필기.
        *   매개변수와 리턴값 복합 활용
        *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
        *   */

        int first = 20;
        int second =10;

        Application07 app7 = new Application07();
        app7.plusTwoNumber(first, second);
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumber(first, second));
        app7.minusTwoNumber (first, second);
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumber(first, second));
        app7.multipleTwoNumber (first, second);
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumber(first, second));
        app7.multipleTwoNumber (first, second);
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumber(first, second));
    }

    /** 문서화 주석
     * <pre>
     *     매개변수로 전달 받은 두 수를 더하여 반환하는 기능 제공
     * </pre>
     * @param first 더하기를 할 첫번째 정수
     * @param second1 더하기를 할 두번째 정수
     * @return 매개변수로 전달 받은 두 수를 더한 결과
     * */

    public int plusTwoNumber(int first, int second1){       // ( ) ->매개변수
        return first + second1;
    }

    public int minusTwoNumber(int first, int second){
         return first - second;
    }
    public int multipleTwoNumber(int first, int second) {
        return first * second;
    }
    public int divideTwoNumber(int first, int second) {
        return first / second;
    }

}
