package homework10;
/*
Написать метод, принимающий на вход массив целых чисел.
 Метод должен вернуть массив, состоящий только из простых чисел,
  присутствующих в изначальном массиве
 */

 import java.util.ArrayList;
 import java.util.List;

    public class Task3 {
        public static void main(String[] args) {
            int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            int[] primes = filterPrimes(numbers);
            System.out.println(java.util.Arrays.toString(primes));
        }

        public static int[] filterPrimes(int[] array) {
            List<Integer> primesList = new ArrayList<>();
            for (int num : array) {
                if (isPrime(num)) {
                    primesList.add(num);
                }
            }
            int[] primesArray = new int[primesList.size()];
            for (int i = 0; i < primesList.size(); i++) {
                primesArray[i] = primesList.get(i);
            }
            return primesArray;
        }

        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }