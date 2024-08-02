package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호를 입력하세요 : ");
        String str = sc.nextLine();

        char[] password = str.toCharArray();

        for(int i = 8; i < str.length(); i++){
            password[i] = '*';
        }

        for(char out : password){
            System.out.print(out);
        }
    }
}
