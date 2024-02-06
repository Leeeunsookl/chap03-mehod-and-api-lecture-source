package com.ojiraffers.section01.method;

public class Practice01 {

    public static void main(String[] args) {

        System.out.println("===================ch1 레벨1 베이직1======================");

        System.out.println("===================레벨1 베이직1======================");
        int num1 = 20;
        int num2 = 30;

        System.out.println("더하기 : "+ (num1+num2));
        System.out.println("빼기 : "+ (num1-num2));
        System.out.println("곱하기 : "+ (num1*num2));
        System.out.println("나누기 : "+ (num1/num2));
        System.out.println("나머지 : "+ (num1%num2));

        System.out.println("===================레벨1 베이직2======================");

        double 너비 = 12.5;
        double 높이 = 36.4;

        double 면적 = 너비*높이;
        double 둘레 = (너비+높이)*2;

        System.out.println("면적: "+ 면적);
        System.out.println("둘레: " + 둘레);

        System.out.println("===================레벨2 노말1======================");

        char ch1 = 'a';

        System.out.println( " 문자 a 유니코드:" + (int)ch1 );

        System.out.println("===================레벨2 노말2======================");

        double 국어 = 80.5;
        double 수학 = 50.6;
        double 영어 = 70.8;

        int sum = (int)(국어+수학+영어);
        System.out.println("합계"+sum);

        int 평균= (int)(국어+수학+영어)/3;
        System.out.println("평균:"+ 평균);

        System.out.println("===================레벨3 하드1======================");

        System.out.println("===================ch2 레벨1 베이직1======================");

        int x=2;
        int y=5;
        char c= 'A';
        // x += 2
        // x = x + 2

//        && 먼저, || 다음


        System.out.println('c'<='Z');
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++); // 15-2>13 , x=3
        System.out.println(x+=2);

        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        System.out.println("===================ch2 베이직1 레벨2======================");

        int numOfApples = 92;
        int sizeOfBucket = 10;

        System.out.println(numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket)>0? 1:0);
        int numOfBucket = (numOfApples/sizeOfBucket+1);
        System.out.println("바구니 = " + numOfBucket);

        System.out.println("===================ch2 베이직1 레벨3======================");

        int num = 456;
        System.out.println((num-num%100));

        int num33 = 333;
        System.out.println( (num33 - num33%10 +1));
        int num77 = 777;
        System.out.println( (num77 - num77%10 +1));

        System.out.println(num33/10*10 +1 );        //int는 원래 정수형 그리고 왼쪽 연산이라 그냥 나누고 곱해도 됐다.

        Practice01 app4 = new Practice01();
        app4.testMethod2("시", "15", "초");

//        public void testMethod2(){
//
//            System.out.println("testMethod2()");

    }

    private void testMethod2(String 시, String number, String 초) {

    }




}
