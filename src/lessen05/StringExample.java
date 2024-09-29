package lessen05;

public class StringExample {
    public static void main(String[] args) {
        String string = "Java"; // Обьявление иинициализация переменной типа String.
        String string1 = new String("Hello");; // Тоже создание новой страки (нерекомендуемый)
        System.out.println(string);
        // Получить колличество символов в страке (длинна строки)
        int length = string.length();
        System.out.println("length: " + length);
        // Метод позваляет перевести все символы строки в верхней регистр
        System.out.println(string.toUpperCase());
        System.out.println("string: " + string);
        // String иммутабельна (неизменна).
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какую-то переменную.
        String stringUpper = string.toUpperCase();
        System.out.println("stringUpper: " + string);
        // toLowercase() Переводит все символы строки в нижний регистр
        // результат работы метода мы можем сохранить и в ту же самую переменную. переписав ее значение
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println(" ======================= \n");
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        // различные варианты конкатенации (склеивание / обьядинения) строк.
        // конкатенация.
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);
        // Конкатенация vs мат. операция сложения.
        System.out.println(1 +3);
        //       сложения 4 конкатенация
        System.out.println(1 + 3 + " : " + 2 + 3);  // 1+3 = сложение -> 4 + " : " = конкатенация -> "4 : " + 2 = конкатенация -> "4 : 23"
        System.out.println(1 + 3 + " : " + (2 + 3));
        // Конкатенация метод 2
        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3); // str1 + str2 + str3
        System.out.println("concatStr2: " + concatStr2);
        // Цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat( "!!!"); // (str1 + str2) + str3 + "!"
        System.out.println("concatStr3: " + concatStr3);
        // Конкатенация 3
        // "One", "helo", "java" -> "One hello java"
        String concatStr4 = str1 + " " + str3 + " " + "java";
        System.out.println("concatStr4: " + concatStr4);




    }
}
