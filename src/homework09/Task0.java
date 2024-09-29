package homework09;

public class Task0 {
    public static void main(String[] args) {
         /* Написать метод, добавляющий входной символ.
        Метод должен вывести на экран число, соответствующее количеству символов в строке.
        Например: Если в методе пришла строка «hello» — метод должен вывести число 5
        (так же, как в строке hello 5 символов)
         */
        printStringLength("hello");
    }

    public static void printStringLength(String str) {
        int lenght = str.length();
        System.out.println("количество символов в строке \"" + str + "\": " + lenght);
    }
}
