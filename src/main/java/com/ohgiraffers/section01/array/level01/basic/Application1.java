package com.ohgiraffers.section01.array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        for(int out : array){
            System.out.print(out + " ");
        }
    }
}
