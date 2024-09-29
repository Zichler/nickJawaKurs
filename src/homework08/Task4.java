package homework08;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Напишите программу, которая просит пользователя ввести слово "hello".
        Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
        Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет
        введено правильное слово.
        Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
        и выведите это количество на экран.
        */
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int attempts = 0;

        while (!input.equals("hello")) {
            System.out.print("Введите слово: ");
            input = scanner.nextLine();
            attempts++;
        }

        System.out.println("Спасибо! Вы ввели правильное слово.");
        System.out.println("Количество попыток: " + attempts);

    }
}
