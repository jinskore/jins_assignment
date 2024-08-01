package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("체중 입력 : ");
        int weight = sc.nextInt();

        System.out.println("신장 입력 : ");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);
//        System.out.println(BMI);

        if(BMI < 20){
            System.out.println("당신은 저체중입니다.");
        } else if (BMI >= 20 && BMI <25) {
            System.out.println("당신은 정상체중입니다.");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("당신은 과체중입니다.");
        } else if (BMI >= 30) {
            System.out.println("당신은 비만입니다.");
        }
    }
}
