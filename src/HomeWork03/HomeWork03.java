package HomeWork03;

public class HomeWork03 {
    public static void main(String[] args) {
        int myAge; //Обьявение переменной типа int
        myAge = 36; //Первое присвоение значение переменной возраста
        System.out.println(myAge);
        byte byteMyAge = 36; // обьявление переменной byte
        System.out.println("my age: " + byteMyAge);
        short shortMyAge = 36; //Обьявление переменной short
        System.out.println("my age: " + shortMyAge);
        long longMyAge = 36; //обьявление переменной Long
        System.out.println("my age: " + longMyAge);
        double doubleMilk = 1.59;
        System.out.println("Price of Milk: " + doubleMilk);
        System.out.println("Nick Zichler");
                int num1 = 0;
                int num2 = 1;
                int num3 = 2;
                int num4 = 3;

                int sum = num1 + num2 + num3 + num4;

                double average = sum / 4.0;

                System.out.println("Сумма: " + sum);
                System.out.println("Среднее арифметическое: " + average);

                double fractionalPart = average - (int) average;
                System.out.println("Дробная часть: " + fractionalPart);
        double priceA = 1000.0;
        double priceB = 500.0;
        double discountRate = 0.10;

        double totalPrice = priceA + priceB;
        double discountAmount = totalPrice * discountRate;
        double discountedPrice = totalPrice - discountAmount;

        System.out.println("Общая стоимость без скидки: " + totalPrice + " евро");
        System.out.println("Скидка: " + discountAmount + " евро");
        System.out.println("Стоимость со скидкой: " + discountedPrice + " евро");
// Температуры за неделю
        double[] temperatures = {28, 25, 28, 22, 19, 15, 14};
        double doublesum = 0;
        for (double temp : temperatures)
            sum += temp;
        // Вычисление средней температуры
        double averageTemperature = sum / temperatures.length;
        System.out.println("Средняя температура за неделю: " + averageTemperature + " градусов");

    }
}