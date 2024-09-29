package homework10;
/* Написать метод со следующим функционалом
На вход метод принимает массив целых чисел и число - длину нового массива.
 Метод должен создать и распечатать массив заданной в параметрах длинны.
  В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода

 */
public class Task1 {
    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(originalArray, 3); // Ожидаемый вывод: {0, 1, 2}
        copyOfArray(originalArray, 5); // Ожидаемый вывод: {0, 1, 2, 0, 0}
    }

    public static void copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        int i = 0;
        while (i < newLength) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }
            i++;
        }
        System.out.println(java.util.Arrays.toString(newArray));


    }
}
