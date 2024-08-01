package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int num;

        while (true) {
            System.out.print("2보다 큰 정수를 하나 입력하세요: ");
            num = sc.nextInt();

            if (num > 2) {
                break; // 유효한 숫자가 입력되면 루프 탈출
            } else {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
            }
        }

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.println("소수다.");
        }else{
            System.out.println("소수가 아니다.");
        }
    }
}
