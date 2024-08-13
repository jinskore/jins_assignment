package com.ohgiraffers.chap13.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int score = 0;
        String str = "";
        int sum = 0;

        while(true){
            System.out.println("학생 성적 : ");
            score = sc.nextInt();
            alist.add(score);
            sum += score;

            sc.nextLine();

            System.out.println("추가 입력하려면 : ");
            str = sc.nextLine();

            if(!str.equalsIgnoreCase("y")){
                break;
            }
        }

        System.out.println("학생 인원 : " + alist.size());
        System.out.println("평균 점수 : " + (double) sum / alist.size());
    }
}
