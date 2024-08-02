package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setDim(10, 20, 30);
        myBox2.setDim(60, 40, 50);
        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
    }
}
