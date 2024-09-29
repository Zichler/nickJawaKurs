package homework06;

public class Task1 {
    public static void main(String[] args) {
        /*
        Дан текст Programming is fun.
  Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
   и выведите результат в виде булевой переменной.
         */
        String stringText = "Programming is fun";
        boolean containsFun = stringText.contains("fun");
        System.out.println(containsFun);
    }
}
