package com.ohgiraffers.section01.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            int randNum = rand.nextInt(45) + 1;
            arr[i] = randNum;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }

        Arrays.sort(arr);
        for(int out : arr){
            System.out.print(out + " ");
        }

        // problem : 중복값 없애기.. -> 코드 참고..
    }
}
