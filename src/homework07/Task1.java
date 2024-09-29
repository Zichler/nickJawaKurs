package homework07;

import java.util.Scanner;
/* Требуется написать программу, которая предложит пользователю ввести число для выбора: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три(текстом)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (1, 2 или 3):");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели число один");
                break;
            case 2:
            System.out.println("Вы ввели число два");
            break;
            case 3:
            System.out.println("Вы ввели число три");
            break;
            default:
            System.out.println("я таких чисел не знаю");
        }
    }

    }


