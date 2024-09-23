package home.work;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class macciv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите минимальное число: ");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное число: ");
        int max = scanner.nextInt();
        int[][] array = new int[num1][num2];
        RandomArrays(array, min, max);
        System.out.println("Ваш массив: " + Arrays.deepToString(array));

    }
    //Todo пройтись в дебагге по шагам поискать почему =
    public static void RandomArrays(int[][] array, int min, int max){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * (max - min)) + min;
            }
        }
    }

}
