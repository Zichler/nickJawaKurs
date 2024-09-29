package homework09;

import java.util.Scanner;

/* Написать метод, получающий массив целых чисел и распечатывающий массив в обратном порядке.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
 */

public class Task1 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число:");
                int number = scanner.nextInt();
                printNumberInReverse(number);
            }

            public static void printNumberInReverse(int number) {
                int reversed = 0;
                while (number != 0) {
                    int digit = number % 10;
                    reversed = reversed * 10 + digit;
                    number /= 10;
                }
                System.out.println("Число в обратном порядке: " + reversed);
        }
    }

