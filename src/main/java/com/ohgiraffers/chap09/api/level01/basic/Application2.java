package com.ohgiraffers.chap09.api.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        // 영어만 입력값이 들어온다고 따진다면..
        String lowstr = str.toLowerCase();
        String[] sarr = str.split(" ");

        String[] uniquewords = new String[sarr.length];
        int[] count = new int[sarr.length];
        int cnt = 0;

        for(String s : sarr){
            boolean flag = false;

        }
    }
}
