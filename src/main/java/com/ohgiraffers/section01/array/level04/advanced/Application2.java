package com.ohgiraffers.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[4];

        // 중복되지 않게 arr 배열에 난수 넣기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }

        int cnt = 10;

        while(cnt > 0){
            int ball = 0;
            int strike = 0;
            System.out.println(cnt + "회 남으셨습니다.");
            System.out.println("4자리 숫자를 입력하세요 : ");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if(!(num >= 1000 && num <= 9999)){
                continue;
            }

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < str.length(); j++){
                    if(arr[i] == Character.getNumericValue(str.charAt(j))){
                        if(i == j){
                            strike++;
                        }else{
                            ball++;
                        }
                    }
                }
            }

            System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
            cnt--;
        }

        for(int out : arr){
            System.out.println(out + " ");
        }
    }
}
