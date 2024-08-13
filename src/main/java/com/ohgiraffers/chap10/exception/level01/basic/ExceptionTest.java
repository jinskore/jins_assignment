package com.ohgiraffers.chap10.exception.level01.basic;


import java.util.InputMismatchException;

public class ExceptionTest {
    public int divide(int a, int b) throws IfZero {

        if(b == 0) {
            throw new IfZero("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        }
        else{
            return a / b;
        }
    }
}
