package org.example.datatypes;
import java.util.Arrays;
import java.util.Scanner;

public class IfAndSwitchCondittions {

    /*public static void main(String[] args) {*/
        //TODO 1. получить от пользователя из консоли число
        //2. Если число четное вывести что число четное иначе вывести что числе нечетное
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        if (value % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");*/



        //Todo switch написать прогармму времена года если  пользваотель ввел один из месяцев декабрь январь, февраль, вывести зима- зима и тд для сотальных месяцев
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month = scanner.nextLine();
        switch (month){
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

        }*/



        //TODO ПОпросить пользователя ввести 5 имен  и сохарнить их в массиов строок после этого вывести все значения массива

        //В консоль вывести меню для пользователя
        //1.ввести имя
        //2. удалить имя
        //3. отредактировать имя
        //4. вывести все именя
        //подсказка  - для каждого действия можно создать метод, и выбирать его при помощи switch



    static String[] names = new String[5];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберете действие, которое вы хотите сделать ");
            System.out.println("1. Ввести имя");
            System.out.println("2. Удалить имя");
            System.out.println("3. Отредактировать имя");
            System.out.println("4. Вывести все имена");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    addName();
                    break;
                case 2:
                    deleteName();
                    break;
                case 3:
                    renameName();
                    break;
                case 4:
                    vseName();
                    break;
                default:
                    System.out.println("Ошибка! Попробуйте ещё раз");
            }
        }
    }
    public static void addName(){
        Scanner scanner = new Scanner(System.in);
        if (count < names.length) {
            System.out.println("Введите имя: ");
            String nemy = scanner.nextLine();
            names[count] = nemy;
            count+=1;
            System.out.println("Новый массив имён: " + Arrays.toString(names));
        }
        else{
            System.out.println("Кеш забит. Удалите имя. ");
        }
    }
    public static void deleteName(){
        Scanner scanner = new Scanner(System.in);
        String nemy1 = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            //Todo в дебаггере проверить с == и equals
            if (nemy1.equals(names[i])){
                names[i] = null;
                System.out.println("имя удалено");

                break;
            }
                //Todo проверить в дебаггере по шагам почему это некорретная релизация - кейс для проверки искомое имя во второй ячейке
                //Для проверки данного кейсв надо заполинть 2 имени и удалить первый
            System.out.println("Имя не найдено");
                break;

        }
        System.out.println("Новый массив имён: " + Arrays.toString(names));

    }
    public static void renameName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Текущий массив: " + Arrays.toString(names));
        System.out.println("Введите имя, которое хотите заменить: ");
        String nemy2 = scanner.nextLine();
        System.out.println("Введите имя для замены: ");
        String renNemy2 = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            if (nemy2.equals(names[i])){
                names[i] = renNemy2;
                System.out.println("Новый массив имён: " + Arrays.toString(names));
            }
            else {
                System.out.println("Имя не найдено");
                break;
            }
        }
    }
    public static void vseName(){
        for (int i = 0; i < names.length; i++) {
            if (i < count){
                System.out.println("Введено имя: " + names[i]);
            }
            else {
                break;
            }
        }
    }
}






