package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int cnt = 1;

        while (true) {
            System.out.println("정수를 입력하세요 : ");
            int num = sc.nextInt();
            if(num > randomNum){
                System.out.println("입력하신 정수보다 작습니다.");
                cnt++;
            } else if (num < randomNum) {
                System.out.println("입력하신 정수보다 큽니다.");
                cnt++;
            } else{
                System.out.println("정답입니다. " + cnt + "회만에 정답을 맞추셨습니다.");
                break;
            }

        }
    }
}
