package lessen04;

public class TypeCharExample {
    public static void main(String[] args) {
        char a = 'A'; // Переменная будет хранить букву Ф латинского алфавита
        System.out.println("A: " + a);
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита, соответствующая коду 65 в девятичной системе счисления
        char a2 = 0x41; // Присваиваем число в 16-формате. что соответствует той же букве А
        a2 = 0x41; // Полная форма записи числа в 16 системе счисления
        char a3 = '\u0041'; //Ещё один способ создать значение в 16 формате
        char x = '\u1507';
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("x " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);
        digit0 = (char) (digit0 + 5);
        int var = 5;
        var = var + 5; // var = var + 5;
        System.out.println("var: " + var);

    }
}