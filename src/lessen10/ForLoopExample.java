package lessen10;

import java.util.Random;

public class ForLoopExample {
    public static void main(String[] args) {
        /* for ( Блок инициализации, блок проверок, блок изменений) {
      // Тело Цикла }

         */
        // Вывести числа на экран
        int j = 0;
        while (j <= 10) {
            System.out.println(j + ", ");
            j++;
        }
        System.out.println("\nEnd while loop " +j);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ", ");
        }
        System.out.println("\nEnd for loop");
        /* for ( ; ;) {
            System.out.println("Hello Word");
        }
        // Запуститс бесконечный цикл

         */
        int i1 = 5;
        for ( i1 = 0; i1 >= 0; i1 = i1 + 100_000) {
            System.out.println(i1 + ", ");
        }
        System.out.println();
        System.out.println("i1 = " + i1);
        // Инициализация в блоке
        long temp = 100_000_000_000_000L;
        System.out.println("temp: " + temp);

        for (String str = "Hallo"; str.length() < 10; str += "§") {
            System.out.println(str);
        }
        System.out.println("Продолжение кода");
        // if условия оператор;
        if (true) System.out.println("true");
        // {} Позволяет обьеденять в себе несколько команд от 0 до бесконечности
        // for () оператор
        // Мы иможем инициализировать несколько каманд в блоке инициализации
        // В блоке изменений мы тоже можем менять несколько переменных

        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a +k, f++ ) {
            System.out.println(k + " : " + a + " : " +f);
        }
        System.out.println("\n ==============");

        //Создать Массив целых чисел случайной длинны в диапазоне от 5 до 15
        // Заполнить Массив случайными числами от -50 до 50 включительно
        Random random = new Random();
        int[] ints = new int[random.nextInt(11) +5]; // получить случайное длинну
        System.out.println("Длинна массива: " + ints.length);
        System.out.println("[");
         // continue, break
        for (int i = 1; i < 7; i++){
            if (i == 3) continue; // continue переход к следующей интерации цикла
            // Мы передем в блок изменения переменных, потом в блок проверки условия
            // В текущей интерации после contienue все операторы в теле будут пропущены
            System.out.println(i + ", ");
        }
        System.out.println();
        for (int i = 1; i < 7; i++) {
            if (i == 3) break; // break заканцивает текущую интерацию цикла
            // Все последние интерации выполнены не будут
            System.out.println(i +"; ");
        }
        System.out.println("\nEnd loop with break");

        }
    }

