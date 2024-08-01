package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        num = num % 26;

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char) ('a' + (ch - 'a' + num) % 26);
            } else if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char) ('A' + (ch - 'A' + num) % 26);
            }
        }

        System.out.println(new String(arr));
    }
}
