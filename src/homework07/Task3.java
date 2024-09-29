package homework07;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        String digitStr = scanner.nextLine();
        if (digitStr.length() !=4) {
            System.out.println("сообщение об ощибке");
        } else {
            System.out.println((int) digitStr.charAt(0));
        }
    }
}
