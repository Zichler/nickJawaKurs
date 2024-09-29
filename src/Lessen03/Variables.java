package Lessen03;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable; // Обьявение переменной типа int
        myFirstVariable = 1; // Первое присвоение значение переменной.
        int mySecondVariable = 25; // Обьявление и инициализация в одной строке
        System.out.println(mySecondVariable);
        System.out.println(mySecondVariable);
        mySecondVariable = 50; // присвоение нового значение
        System.out.println("Значение переменной: " + mySecondVariable);
        // byte, shotr, long
        byte byteVariable = 125; // Обьявление и инициализация переменной типа byte;
        byteVariable = 45;
        System.out.println("Значение переменной byteVariable: " + byteVariable);
        short shortVar; // Обьявление переменной типа short
        shortVar = 31000; // Инициализация переменной (примвоение значений)
        System.out.println("Short variable: " + shortVar);
        // любое число в коде воспринимается компелятором как число типа int
        long longVar = 2_100_000_0000L; // знак не влияет на значение переменной
        // L в конце числа - явным образом указать, что число в формате long
        System.out.println("Long variable: + longVar");
        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);
        float floatVar = 11.65F; // Явно указать, что число в формате float
        System.out.println("Float variable: " + floatVar);

    }
}
