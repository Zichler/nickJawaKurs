package homework04;

public class Task4 {
    public static void main(String[] args) {
        char n = 'n';
        char i = 'i';
        char c = 'c';
        char k = 'k';

        // Преобразовываю каждой букву в верхний регистр
        n = (char) (n - 32);
        i = (char) (i - 32);
        c = (char) (c - 32);
        k = (char) (k - 32);

        // Вывод результата
        System.out.println("" + n + i + c + k);
    }
}
