package lessen08;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 100;
        while (i >= 90){
            System.out.println(i--);
            // i--; // i = i -1;
        }
        i = 1;
        int sum =0;

        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println("сумма числа от 1 до 100: " + sum);
        i = 1;
        while (i <= 21) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
            String str = " === Hello! === \n";
            i = 0; // 0,1,2...... len -1
            while (i <= str.length()-1) {
                char ch = str.charAt(i);
                System.out.println(ch);

            }
        }

    }
}
