package com.ohgiraffers.chap13.Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("학생 ID 입력('exit' 입력 시 종료) : ");
            String id = sc.nextLine();

            if(set.contains(id)){
                System.out.println("이미 등록 된 ID입니다.");
            }else if(id.equals("exit")){
                System.out.println("모든 학생의 ID : " + set);
                break;
            }else{
                set.add(id);
                System.out.println("ID가 추가 되었습니다.");
            }

        }
    }
}
