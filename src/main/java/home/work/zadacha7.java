package home.work;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class zadacha7 {
    //TODO написать метод принимает число и возвращает это число как строку
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое хотите преобразовать в строку: ");
        int num1 = scanner.nextInt();
        System.out.println(pupa2(num1));
    }
    public static String pupa2(int x){
        return Integer.toString(x);
    }

}
