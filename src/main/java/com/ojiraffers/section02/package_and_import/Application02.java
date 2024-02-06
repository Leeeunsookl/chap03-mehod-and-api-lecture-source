package com.ojiraffers.section02.package_and_import;

import com.ojiraffers.section01.method.Calculator;      //자동으로 import를 써줌

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. import 에 대해 알아볼 수 있다. */
        /* 필기.
        *   임포트 란?
        *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
        *   */

        /* 목차. 1. non-static method의 경우 */
        Calculator calc = new Calculator();


    }

}
