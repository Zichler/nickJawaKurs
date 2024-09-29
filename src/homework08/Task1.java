package homework08;

public class Task1 {
    public static void main(String[] args) {
        /* Найдите произведение всех чисел от 1 до 15 включительно.
         Результат выведите на экран
         */
        long number = 1;
        int  i = 1;
        while (i <= 15) {
            number *= i++;
            System.out.println("Произведение всех чисел от 1 до 15 включительно: " + number);
        }
    }
}
