package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMarker {

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static StringBuffer randomUpperAlphabet(int length){
        StringBuffer a = new StringBuffer();
        Random rand = new Random();
        for(int i = 0; i < length; i++){
            char randomChar = (char) (rand.nextInt(26) + 'A');
            a.append(randomChar);
        }
        return a;
    }

    public static String rockPaperScissors(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;
        if(randomNumber == 1){
            return "가위";
        } else if (randomNumber == 2) {
            return "바위";
        }else return "보";

    }

    public static String tossCoin(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(2) + 1;
        return randomNumber == 1 ? "앞면" : "뒷면";
    }
}
