package homework08;

public class Task3 {
    public static void main(String[] args) {
      /* Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
       */
        int i = 1;
        while ( i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
                i++;
            }
        // Вторая задача: распечатать первые 7 чисел от 1 до 100, которые делятся на 5 без остатка
        i = 1;
        int count = 0;
        System.out.println("\nПервые 7 чисел от 1 до 100, которые делятся на 5 без остатка:");
        while (i <= 100 && count < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}