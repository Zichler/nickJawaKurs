package Lessen15;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создает новый обьект класса cat
        cat.sayMeow();
        cat.run();
        cat.sleep();


        String catName = cat.name;
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + cat.age);

        System.out.println("========== \n");

        Cat cat1 = new Cat("Max");
        // Будет создан новый обьект класса Cat
        // Имя строка которая была передана в конструкторе будет присвоено полю класса
        System.out.println("Color: " + cat1.color);
        System.out.println("Name: " + cat1.name);
        System.out.println(" =======\n");
        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();
        System.out.println(" ===========\n");
        Cat barsik = new Cat("Barsik", "white", 2);
        barsik.whoAmI();

    }
}
