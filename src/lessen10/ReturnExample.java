package lessen10;

public class ReturnExample {
    public static void main(String[] args) {
      sum(5.9, 2.0);
    }
    public static int sum(int a, int b) {
        if (a > b) {
            return a + b;
        } else {
            return "String".length();
        }
    }
    public static void sum (double a, double b) {
        if (a > b) {
            return;
        }
        System.out.println("Error! a > b - c такими методами метод работать отказывается.");
        return;
    }

    }


