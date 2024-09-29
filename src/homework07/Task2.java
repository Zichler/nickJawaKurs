package homework07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /* Запишите в 4 переменные случайные числа от 0 до 100.
Вы вводите все 4 числа на экране.
Программа должна определить наибольшее из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
         */
        Random random = new Random();
        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);
        System.out.printf("%d | %d | %d | %d\n", var1, var2, var3, var4);
        int max = var1;
        if (var2 < var1);
        if (var3 < var1);
        if (var4 < var1);
        System.out.println("Мaксимум:" +max);
    }
}
