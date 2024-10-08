package Training;

public class Traning1 {
    public static void main(String[] args) {
        double height = 1.85;
        double weight = 90.5;
        double index = weight / (height * height);
        System.out.println("Индекс массы тела: " + index);
        if (index <= 16) {
            System.out.println("Выраженный дефицит тела. " + "Необходима срочная консультация врача");
        } else if (index <= 18.5) {
            System.out.println("Недостаточная (дефицит) масса тела");
        } else if (index <= 25) {
            System.out.println("Норма");
        } else {
            System.out.println("Ожирение первой степени");
        }
    }
}