package home.work;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class zadacha6 {
    //TODO написать метод который ничего не принмает и возвращает случайное число в диапазоне int
    public static void main(String[] args){
        int i = pupa();
        System.out.println("Сгенерировано случайное число: " + i);
    }
    public static int pupa(){
        Random random = new Random();
        return random.nextInt();
    }
}
