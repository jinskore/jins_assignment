package com.ohgiraffers.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수인 양의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0 || num < 0) {
            System.out.println("양수 혹은 홀수만 입력해야합니다.");
        }

        int[] arr = new int[num];

        int first = 1;
        for(int i = 0; i <= (int)num/2; i++){
            arr[i] = first;
            first++;
        }

        first -= 2;
        for(int i = (int)num/2 + 1; i < arr.length; i++){
            arr[i] = first;
            first--;
        }

        for(int out: arr){
            System.out.print(out + " ");
        }
    }
}
