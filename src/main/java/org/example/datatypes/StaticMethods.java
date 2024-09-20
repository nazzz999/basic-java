package org.example.datatypes;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random; //библеотека для импорта рандомного числа
public class StaticMethods {

    //Todo написать метод который на вход примнимает два числа и возвращает то котороео больше
    /*public static void main(String[] args) {
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

    }*/


    //TODO написать метод который ничего не принмает и возвращает случайное число в диапазоне int
    /*public static void main(String[] args){
        int i = pupa();
        System.out.println("Сгенерировано случайное число: " + i);
    }
    public static int pupa(){
        Random random = new Random();
        return random.nextInt();
    }*/


    //TODO написать метод принимает число и возвращает это число как строку
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое хотите преобразовать в строку: ");
        int num1 = scanner.nextInt();
        System.out.println(pupa2(num1));
    }
    public static String pupa2(int x){
        return Integer.toString(x);
    }*/


    //TODO написать метод который примниает число 1-12 и по нему возвращает названия месяца , например 1 - явнарь можно использовать switch внутри метода

    /*public static void main(String[] args) {
        System.out.println("Введите месяц года: ");
        Scanner scanner = new Scanner(System.in);
        String moth = scanner.nextLine();
        System.out.println(pupa3(moth));

    }

    public static String pupa3(String x) {
        switch (x) {
            case "декабрь":
            case "февраль":
            case "январь":
                return "Сейчас зима";
            case "март":
            case "апрель":
            case "май":
                return "Сейчас весна";
            case "июнь":
            case "июль":
            case "август":
                return "Сейчас лето";
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                return "Сейчас осень";

        }
     }
        return "Конец";*/

        //TODO написать метод который принимает массив и вовзарщает новый массив со знанчениями из переданного но в обратном порядоке
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int num = scanner.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + "e число массива: ");
            int value = scanner.nextInt();
            array[i] = value;
        }
        System.out.println("Ваш введённый массив: " + Arrays.toString(array));
        System.out.println("Ваш массив наоборот: " + Arrays.toString(pupa4(array)));
    }

    public static int[] pupa4(int[] array){
        int[] pupa4 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            pupa4[i] = array[array.length - 1 - i];
        }
        return pupa4;
    }*/





}
