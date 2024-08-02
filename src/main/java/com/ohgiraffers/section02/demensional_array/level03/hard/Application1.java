package com.ohgiraffers.section02.demensional_array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0;
        while(true){
            System.out.println("가로 행의 개수를 입력하세요 : ");
            row = sc.nextInt();
            if(row >= 1 && row <= 10){
                break;
            }else{
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요");
            }
        }

        int column = 0;
        while(true){
            System.out.println("세로 열의 개수를 입력하세요 : ");
            column = sc.nextInt();
            if(column >= 1 && column <= 10){
                break;
            }else{
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요");
            }
        }

        char[][] carr = new char[row][column];

        Random rand = new Random();

        for(int i = 0; i < carr.length; i++){
            for(int j = 0; j < carr[i].length; j++){
                carr[i][j] = (char) ((char)rand.nextInt(26) + 65);
                System.out.print(carr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
