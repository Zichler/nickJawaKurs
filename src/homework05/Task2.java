package homework05;

/*
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";
        String space = " ";
        String contact =  String.join(space, str, str1, str2, str3, str4);
        System.out.println(contact + "; длина: " + contact.length());

        String concatStr2 = str.concat(space).concat(str1).concat(space).concat(str2).concat(space).concat(str3).concat(space).concat(str4);
        System.out.println(concatStr2 + "; длина: " + concatStr2.length());

    }
}
