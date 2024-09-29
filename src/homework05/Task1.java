package homework05;
/*
Напишите программу, которая будет просить пользователя ввести его имя с клавиатуры.
используйте Scanner, сохраните имя в переменном виде String.
Вы вводите количество экранных символов во имя пользователя.
Создайте два переменных типа char: один должен хранить первый символ имени, другой — последний.
Вы вводите десятиэкранный код (код символа в десятичной системе перечисления) первого и последнего символа имени.

 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String input = scanner.nextLine();
        System.out.println("Количество символов в имени пользователя: " + input.length());
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() -1);
        System.out.println(firstChar + " | " + (int) firstChar);
        System.out.println(lastChar + " | " + (int)lastChar);
    }
}
