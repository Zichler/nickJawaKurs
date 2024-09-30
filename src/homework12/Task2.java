package homework12;
/* Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class Task2 {
    public static void main(String[] args) {int[] array = {1, 2, 3, 4, 5, 6}; // Пример массива
        int sum = sumOfEvenNumbers(array);
        System.out.println("Сумма всех четных чисел в массиве: " + sum);
    }
    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

}
