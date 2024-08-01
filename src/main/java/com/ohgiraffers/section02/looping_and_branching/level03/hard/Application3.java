package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                return;
            }
        }
        System.out.println("문자 입력 : ");
        char ch = sc.next().charAt(0);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                cnt++;
            }
        }
        System.out.println("포함된 갯수 : " + cnt);


    }
}