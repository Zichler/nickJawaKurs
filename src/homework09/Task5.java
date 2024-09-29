package homework09;
/* Задание 5
Написать метод, который принимает массив строк. Выведите на экран все символы самой длинной строки из массива.
Пример:
{ "One", "Two", "Twenty" } ->
T
w
e
n
t
y
 */
public class Task5 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty"};
        printLongestStringCharacters(array);
    }

    public static void printLongestStringCharacters(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пуст или не задан.");
            return;
        }

        String longestString = "";
        for (String str : array) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        System.out.println("Самая длинная строка: " + longestString);
        for (char c : longestString.toCharArray()) {
            System.out.println(c);
        }
    }
}
