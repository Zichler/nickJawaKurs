package homework16;

public class MagicApp {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7};
        MagicArray2 magicArray = new MagicArray2(test);
test[0] = 1000000;
        System.out.println(magicArray.toString());
    }
}
