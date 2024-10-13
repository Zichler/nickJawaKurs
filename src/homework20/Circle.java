package homework20;

public class Circle extends Shape {
    private double radius;



    public double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}