package homework04;

public class Task1 {
    public static void main(String[] args) {
        /* Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
         */
        int intVal = 10;
        double myDouble;
        myDouble = intVal; // неявное преобразование типа int в тип double
        System.out.println("myDouble: " + myDouble);
    }
}
