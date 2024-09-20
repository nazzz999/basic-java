package org.example.datatypes;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Вернет строку
        String s = scanner.nextLine();

        //Вернет число
        int i = scanner.nextInt();
    }
}
