package home.work;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class zadacha8 {
    //TODO написать метод который примниает число 1-12 и по нему возвращает названия месяца , например 1 - явнарь можно использовать switch внутри метода

    public static void main(String[] args) {
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

        return "Конец";
    }
}
