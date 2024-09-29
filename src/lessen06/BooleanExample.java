package lessen06;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;
        int x = 10;
        int y = 5;
        //Сравнение на равенство
        boolean b1 = x == y; // x равен y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + " -> " + b1);
        // Не равенство "!="
        // X не равно Y
        b1 = x != y; // 10 !=5 -> true
        System.out.println(x + " !=" + y + "->" + b1);

        // Больше ">"
        // X Больше чем Y
        b1 = x > y; // 10 > 5 -> true
        System.out.println(x + " > " + y + "->" + b1);
        


    }
}
