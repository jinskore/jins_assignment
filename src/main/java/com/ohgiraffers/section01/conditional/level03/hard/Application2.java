package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("과일 이름을 입력하세요 : ");
        String str = sc.nextLine();

        switch (str){
            case "사과":
                System.out.println("사과의 가격은 1000원입니다.");
                break;
            case "바나나":
                System.out.println("바나나의 가격은 3000원입니다.");
                break;
            case "복숭아":
                System.out.println("복숭아의 가격은 2000원입니다.");
                break;
            case "키워":
                System.out.println("키위의 가격은 5000원입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
        }
    }
}
