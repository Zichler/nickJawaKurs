package Lessen15;

public class Cat {
    public String name;
    public String color;
    public int age;
    // конструктор класса
    // специальный тип метода. Основная задача - установить начальные значения свойств обьем обьекта
    // основная задача - установить начальные значения свойств обьекта

    /*
    1. Имя конструктора совпадает с имемнем класса
    2. Конструктор не имеет возврощаемого типа
    3. Конструктор вызывается автомотически при создании обьекта
     */
    public Cat(String catName) {
        name = catName;
    }

    // Конструктор по умолчанию
    public Cat() {
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
    } // ключевое слово this используется внутри класса для ссылки на текущий обьект

    // Оно поможет для разрешения конфликта имени между полями класса и параметрами методов
    public Cat(String name, String color, int age) {
        this(name, color);
        // this.name = name;
       // this.color = color;
        this.age = age;
    }

    public void sleep() {
        System.out.println("я сплю!");
    }

    public void run() {
        System.out.println("я бегу!");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }
}
