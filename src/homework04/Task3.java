package homework04;

public class Task3 {
    public static void main(String[] args) {
        /* Потеря данных при преобразовании
Напишите программу, которая:

1.Объявляет переменную longименем bigNumberи присваивает ей значение 15000000000(15 миллиардов).
2.Преобразует bigNumberс intпомощью явного преобразования и сохраняет результат в переменную intимя smallNumber.
3.Выводит значение smallNumberна экран. */
        long bigNumber = 15000000000L;
        int smallNunber = (int)bigNumber;
        System.out.println("smallNumber: " + smallNunber);
    }
}
