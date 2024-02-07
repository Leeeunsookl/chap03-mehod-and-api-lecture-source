package com.ojiraffers.section03.math;

public class Practice02 {

    public static void main(String[] args) {
        
        Practice02 p2 = new Practice02();
        p2.penny(770);
        
    }
    
    public void penny(int coin){
    int penny = coin;
    int a500 = coin/500;
    coin=coin%500;
    int a100 = coin/100;
    coin=coin%100;
    int a50 = coin/50;
    coin=coin%50;
    int a10 = coin/10;
    coin=coin%10;
    
    int sum= a500+a100+a50+a10;

        System.out.println("sum = " + sum);
}
}
