package com.ohgiraffers.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int a = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println("1부터 " + a + "까지의 합 : " + sum);
    }
}
