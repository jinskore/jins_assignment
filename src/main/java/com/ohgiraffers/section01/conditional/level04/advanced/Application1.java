package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.println("영어 점수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("수학 점수를 입력하세요 : ");
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;

        if(avg >= 60 && a >= 40 && b >= 40 && c >= 40) {
            System.out.println("합격입니다!");
        }else{
            if(avg < 60){
                System.out.println("평균 점수 미달로 불합격입니다.");
            }
            if(a < 40){
                System.out.println("국어 점수 미달로 불합격입니다.");
            }
            if(b < 40){
                System.out.println("영어 점수 미달로 불합격입니다.");
            }
            if(c < 40){
                System.out.println("수학 점수 미달로 불합격입니다.");
            }
        }
    }
}
