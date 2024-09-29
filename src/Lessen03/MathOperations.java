package Lessen03;

public class MathOperations {
    public static void main(String[] args) {
        // ctrl +D скопировать строку
        // alt + shift вставить стркоку
        int var1 = 20;
        int var2 = 7;
        int result;
        // сложение
        result = var1 + var2;
        //Результат вычеслений выражения в правой части (от знака =) присваивается в переменную левой части
        System.out.println("result: " + result);
        result =var1 + 5;
        System.out.println("result: " + result);
        // умножения *
        result = var1 * var2;
        System.out.println("result * : " + result);
        // x = 1 + 2 * 2; -> 5
        /*
        0. Скобки
        1. Умножение, Деление
        2. Сложение вычитание
         */
        result = (1 + 2) * 2;
        System.out.println("result 1 + 2 * 2 : + result");




    }
}
