package lessen17;

public class CatApp {
    public static void main(String[] args) {
        Cat17 cat = new Cat17( "Catty", 3, 8);
        cat.seyMeow();
        System.out.println(cat.toString());

        //cat.age = -1000;
        String name = cat.getName();
        System.out.println("name = " + name);
        System.out.println(cat.toString());
    }
}
