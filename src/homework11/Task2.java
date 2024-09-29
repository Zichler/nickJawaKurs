package homework11;
import java.util.Arrays;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Task2 {
    public static void main(String[] args) {
        String[] strings = {"Nick", "Wowa", "Albert", "Sam",  "Ed", "Irina"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));
        System.out.println(" \n ========== testArray = null / length = 0 ==================");
        strings = null;
//        strings = new String[0];
        String[] res = getArrayWithSmallestString(strings);
        System.out.println(" \n ========== null in array ==================");
        strings = new String[]{"Nick1", "Wowa", "Albert", null, "Es", "Irina"};
        res = getArrayWithSmallestString(strings);
        System.out.println();
        System.out.println(Arrays.toString(res));
        System.out.println(" \n ========== null in array is First ==================");
        strings = new String[]{ null, "Wova", "Albert", null, "Ed", "Irina"};
//        strings = new String[]{null,  null, null, null, null};
        System.out.println(Arrays.toString(strings));
        res = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(res));
    } // Methods area
    public static String[] getArrayWithSmallestString(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0]; // []
        }
        // Попытаться присвоить в строки не null
        String notNutValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNutValue: " + notNutValue);
        if (notNutValue == null) {
            return new String[0]; // []
        }
        String smallest = notNutValue;
        String biggest = notNutValue;
        for (int i = 0; i < strings.length; i++) {
            // {null, "Wowa", "Albert", null, "Ed", "Irina"};
            // i = 1
            System.out.print(strings[i] + "; ");
            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }
            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }
        return new String[] {smallest, biggest};
    }
    public static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }
        //Если мы перебрали все элементы массива и не нашли не null значение, возвращаем из метода null
        return null;
    }
}
