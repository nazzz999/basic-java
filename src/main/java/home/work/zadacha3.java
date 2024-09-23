package home.work;
import java.util.Arrays;
import java.util.Scanner;
public class zadacha3 {

    public static void main(String[] args) {

        //Todo switch написать прогармму времена года если  пользваотель ввел один из месяцев декабрь январь, февраль, вывести зима- зима и тд для сотальных месяцев
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month = scanner.nextLine();
        switch (month) {
            case "декабрь":
            case "февраль":
            case "январь":
                System.out.println("Сейчас зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Сейчас весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Сейчас лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Сейчас осень");

        }
    }
}
