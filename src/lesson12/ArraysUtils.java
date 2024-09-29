package lesson12;
public class ArraysUtils {

    // Метод линейного поиска элемента в массиве
    // Осуществляется перебором всех элементов и сравниванием с искомым значением
    // Если значений найдено - возвращается индекс элемента массива
    // Если не найдено - возвращается -1

    // Однозначно сказать, что число отсутствует в массиве?
    // Потребуется перебрать абсолютно все элементы массива -> O(n)

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }

    public static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int mainIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    // Бинарный поиск значения массива
    public static int binarySearch(int[] array, int searchvalue) {
        int startIndex = 0;
        int endIndex = array.length -1; // 12
        int middleIndex;
        // Проверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex); { // 1. 0 <= 12
            // Вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex) /2;
            // Сравниваем значение в средней части массива с искомым
            if (array[middleIndex] > searchvalue) {
                endIndex = middleIndex -1;
            } else {
                startIndex = middleIndex +1;
            }


    }
        // Если цикл while закончен (не осталось частей массива, которые можно поделить пополам
        // Значит искомое значение в массиве отсутствует
        return -1;
}
}
