package lessen17;

public class Cat17 {
    private String name;
    private int age;
    private int weight;
public Cat17(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
}
// Геттер и Сеттер
    public String getName() {
    return name;
    }
    void seyMeow(){
        System.out.println("Meow! " + name);
    }
    public String toString(){
    return "Cat " + name + ", age: " + age + ", weight: " + weight;
    }
}
