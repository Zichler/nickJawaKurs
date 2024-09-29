package homework04;

public class Task2 {
    public static void main(String[] args) {
        /* Явное преобразование double в int
Напишите программу, которая:
Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран. */
        double myDouble = 5.99;
        int intVal = (int) myDouble; // Явное преобразование  из double в int
        System.out.println("intVal: " + intVal);


    }
}
