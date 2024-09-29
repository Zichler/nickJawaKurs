package homework08;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        /* Программа запрашивает у пользователя ввод произвольного числа.
         Вывести сумму цифр этого числа.
         Пример:567432 -> 5+6+7+4+3+2 -> 27
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0);{
            sum += number % 10; // добавляем последнюю цифру к сумме
            number /= 10; // удаляем последнюю цифру из числа
        }

        System.out.println("Сумма цифр числа: " + sum);
    }
}

