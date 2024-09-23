package home.work;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class zadacha9 {
    public static void main(String[] args){
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
    }
}
