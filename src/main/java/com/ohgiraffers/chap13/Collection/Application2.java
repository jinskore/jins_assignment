package com.ohgiraffers.chap13.Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        LinkedList<String> sarr = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("방문 URL을 입력하세요 (단, exit을 입력하면 종료) : ");
            String url = sc.nextLine();

            if(url.equals("exit"))
                break;

            sarr.addFirst(url);
            System.out.println("최근 방문 url : " + sarr);
        }
    }
}
