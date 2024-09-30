package homework15;

public abstract class Friend {
    private String name;
    private int age;
    private double height;
    public Friend() {
        this.name = "Wowa";
        this.age = 25;
        this.height = 1.80;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public void describe() {
        System.out.println("Friend: " + getName() + ", Age: " + getAge() + ", Height: " + getHeight() + " meters");
    }
}
