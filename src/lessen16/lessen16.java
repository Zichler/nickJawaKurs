package lessen16;
import Lessen15.Cat;
public class lessen16 {
    public static void main(String[] args) {
        Cat catVar = new Cat();
        /* 1. Создается новый пакет типа Cat
        2. Вызывается конструктор для иницилизации полей обьекта.
         */
        catVar.whoAmI();
        System.out.println(catVar.name);
        catVar.name = "Jack";
        System.out.println(catVar.name);
        catVar.whoAmI();
        Cat barsik = new Cat("Barsik", "grey", 3);
        barsik.whoAmI();
        System.out.println("name: " + barsik.name);
        System.out.println("color: " + barsik.color);
        System.out.println("age: " + barsik.age);
        barsik.age = 12;
        System.out.println(" ================\n");
        Cat cat1 = new Cat("Barsik", "gray", 3);
        cat1.whoAmI();
        Cat catClone = cat1;
        catClone.whoAmI();
        cat1.age = 100;
        cat1.whoAmI();
        catClone.whoAmI();
        System.out.println(catClone.age);
        catClone.name = "Max";
        catClone.whoAmI();
        System.out.println("========= Kratos");
        catClone = new Cat("Kratos", "black", 99);
        catClone.whoAmI();
        cat1.whoAmI();
         // catClone = null; // если ракоментировать программа аварийно завершися
        System.out.println(catClone.name);
        catClone.whoAmI();
        if (catClone != null) {
            System.out.println(catClone.name);
            catClone.whoAmI();
        }

    }
}
