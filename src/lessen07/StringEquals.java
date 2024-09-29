package lessen07;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String( "Java");
        System.out.println(str1 + " | " + str2  + " | " + str3  + " | " + str4);
        Boolean b1 = (str1 == str2);
        System.out.println("str1 == str3: " + b1);// true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1 == str4: " + (str1 == str4)); // false


    }
}
