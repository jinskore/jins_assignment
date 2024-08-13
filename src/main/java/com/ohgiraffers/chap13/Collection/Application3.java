package com.ohgiraffers.chap13.Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>() {};

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("대기 고객 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit') : ");
            String name = sc.nextLine();

            if(name.equals("next")){
                if(que.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                }else{
                    System.out.println(que.poll() + " 고객님 차례입니다.");
                }
            }else if(name.equals("exit")){
                break;
            }else{
                System.out.println(name + " 고객님 대기 등록 되었습니다.");
                que.offer(name);
            }
        }
    }
}
