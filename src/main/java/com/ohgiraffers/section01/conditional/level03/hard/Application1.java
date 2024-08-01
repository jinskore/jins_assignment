package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 : ");
        int first = sc.nextInt();

        System.out.println("두 번째 정수 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호를 입력하세요 : ");
        char operator = sc.next().charAt(0);

        if(operator =='+'){
            System.out.println(first + " + " + second + " = " + (first + second));
        } else if (operator == '-') {
            System.out.println(first + " - " + second + " = " + (first - second));
        }else if (operator == '*') {
            System.out.println(first + " * " + second + " = " + (first * second));
        }else if (operator == '/') {
            System.out.println(first + " / " + second + " = " + (first / second));
        }else if (operator == '%') {
            System.out.println(first + " % " + second + " = " + (first % second));
        }else{
            System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
    }
}
