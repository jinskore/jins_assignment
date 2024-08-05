package com.ohgiraffers.level01.basic.student.run;

import com.ohgiraffers.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        StudentDTO[] std = new StudentDTO[10];
        while(cnt < 10){
            System.out.println("학년 : ");
            int grade = sc.nextInt();
            System.out.println("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("국어점수 : ");
            int kor = sc.nextInt();
            System.out.println("영어점수 : ");
            int eng = sc.nextInt();
            System.out.println("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            std[cnt] = new StudentDTO(grade, classroom, name, kor, eng, math);
            cnt++;

            System.out.println("계속 추가할 겁니까? (y / n)");
            String answer = sc.nextLine();

            if(answer.equals("y")){
                continue;
            }else{
                break;
            }
        }

        for(int i = 0; i < cnt; i++){
            System.out.println(std[i].getInformation());
        }
    }
}
