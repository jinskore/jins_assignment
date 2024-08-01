package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("받으신 금액을 입력하세요 : ");
        int a = sc.nextInt();

        System.out.println("상품 가격을 입력하세요 : ");
        int b = sc.nextInt();

        int result = a - b;
        int c = a - b;

        int[] bills = {50000, 10000, 5000, 1000};
        int[] coins = {500, 100, 50, 10};

        for(int bill:bills){
            int cnt = c / bill;
            c = c - bill * cnt;
            System.out.println(bill + "원권 지폐 " + cnt + "장");
        }

        for(int coin:coins){
            int cnt = c / coin;
            c = c - coin * cnt;
            System.out.println(coin + "원권 지폐 " + cnt + "장");
        }

        System.out.println("===========");
        System.out.println("거스름돈 : " + result);
    }
}
