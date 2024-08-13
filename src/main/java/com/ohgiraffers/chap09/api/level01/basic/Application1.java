package com.ohgiraffers.chap09.api.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        String[] sarr = str.split(" ");

//        for(String s : sarr){
//            System.out.println(s + " ");
//        }


        System.out.print("변환된 문자열 : ");
        for(int i = 0; i < sarr.length; i++) {
            StringBuilder sb = new StringBuilder(sarr[i]);
            char firstChar = Character.toUpperCase(sarr[i].charAt(0));
            sb.setCharAt(0, firstChar);
            System.out.print(sb + " ");
        }

        System.out.println();
        System.out.print(sarr.length);
    }
}
