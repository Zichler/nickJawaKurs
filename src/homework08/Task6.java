package homework08;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        /* Создать массив целых чисел произвольной длины от 5 до 15.
         Заполнить массив случайными значениями от -50 до 50.
         Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
         */
        Random random = new Random();
        int length = 5 + random.nextInt(11); // Длина массива от 5 до 15
        int[] array = new int[length];
        // Заполнение массива случайными значениями от -50 до 50
        for (int i = 0; i < array.length; i++) {
            array[i] = -50 + random.nextInt(101);
        }
        // Вывод массива
        System.out.println("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Нахождение минимального и максимального значений
        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        // Вычисление среднего арифметического
        double average = (double) sum / array.length;
        // Вывод результатов
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}



