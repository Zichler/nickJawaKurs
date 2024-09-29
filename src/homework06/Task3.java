package homework06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Попросите пользователя ввести целое число с клавиатуры.
        Ваша программа должна вывести строку в формате:
        Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
        Copy
        Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int input = scanner.nextInt();
        scanner.nextLine();
        boolean isEven = input % 2 == 0;
        boolean isDevByThree = input % 3 == 0;
        boolean isTwice = isEven && isDevByThree;

        System.out.println( "Число: " + input + "четное:" + isEven + " ; " +
                "кратно 3: "+ isDevByThree+ " ; четное и кратное 3: " + isTwice);

    }
}
