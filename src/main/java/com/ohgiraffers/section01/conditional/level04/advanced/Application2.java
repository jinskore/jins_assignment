package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("월 급여 입력 : ");
        int a = sc.nextInt();

        System.out.println("매출액 입력 : ");
        int b = sc.nextInt();

        double bonus = 0.0;

        if(b >= 50000000){
            bonus = 0.05;
        } else if (b >= 30000000) {
            bonus = 0.03;
        } else if (b >= 10000000) {
            bonus = 0.01;
        }else{
            bonus = 0.0;
        }

        System.out.println("매출액 : " + b);
        System.out.println("보너스율 : " + (int)(bonus * 100) + "%");
        System.out.println("월 급여 : " + a);
        System.out.println("보너스 금액 : " + (int)(b * bonus));
        System.out.println("===================");
        System.out.println("총 급여 : " + (int)(a + b * bonus));
    }
}
