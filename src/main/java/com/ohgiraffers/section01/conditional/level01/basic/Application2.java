package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            if(num == 0){
                System.out.println("0이다.");
            }
            System.out.println("짝수다.");
        }else{
            System.out.println("홀수다.");
        }
    }
}
