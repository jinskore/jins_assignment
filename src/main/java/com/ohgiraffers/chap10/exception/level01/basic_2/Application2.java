package com.ohgiraffers.chap10.exception.level01.basic_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UnderTwo underTwo = new UnderTwo();

        try {
            System.out.println("생년월일 입력 (yyyy-MM-dd)양식으로 작성 : ");
            String date = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthday = LocalDate.parse(date, formatter);

            underTwo.checkAge(birthday);
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }
    }
}
