package home.work;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


//Todo написать метод который на вход примнимает два числа и возвращает то котороео больше


public class zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println(num(number1,number2));

    }
    public static int num(int x, int y){
        if (x>y)
            System.out.println("Число " +x+ " больше");
        else
            System.out.println("Число " +y+ " больше");
        return 1;

    }
}
