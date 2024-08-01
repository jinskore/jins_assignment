package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        return 55;
    }

    public void checkMaxNumber(int a, int b){
        int max = a > b ? a : b;
        System.out.print(max);
    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }

    public int minusTwoNumber(int a, int b){
        return a - b;
    }
}
