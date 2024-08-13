package com.ohgiraffers.chap10.exception.level01.basic;

import com.sun.source.tree.IfTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        Scanner scanner = new Scanner(System.in);
        // inputmissmatch 예외 조건 실행이 안된다..?
        try {
            System.out.println("분자 입력 : ");
            int a = scanner.nextInt();

            System.out.println("분모 입력 : ");
            int b = scanner.nextInt();
            System.out.println("결과 : " + exceptionTest.divide(a, b));
        } catch (InputMismatchException e) {
            System.out.println("유효한 정수를 입력하세요.");
        } catch (IfZero e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("실행이 완료되었습니다.");
        }
    }
}
