package home.work;
import java.util.Arrays;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
//TODO 1. получить от пользователя из консоли число
//2. Если число четное вывести что число четное иначе вывести что числе нечетное
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        if (value % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }
}

