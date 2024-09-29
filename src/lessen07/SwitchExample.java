package lessen07;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 35;
        if (x == 5){
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if-else: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }


        switch (x) {
            case 5:
                System.out.println("switch: x равен 5");
            case 7:
                System.out.println("switch: x равен 7");
            case 11:
                System.out.println("switch: x равен 11");
            default:
                System.out.println("switch: что-то другое ");
        }
    }
}
