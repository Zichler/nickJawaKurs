package homework09;

import java.util.Scanner;

/* Написать метод, добавляющий на вход число. Метод должен вывести на экран 2 степень этого Числа
Например: Если в методе достаточно числа 3 - метод должен вывести число 8(так как 2 в степени 3 = 8)
класс Math для нахождения чисел использовать нельзя;)
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int result = calculatePowerOfTwo(number);
        System.out.println("2 в степени " + number + " = " + result);
    }

    public static int calculatePowerOfTwo(int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= 2;
        }
        return result;

    }
}
