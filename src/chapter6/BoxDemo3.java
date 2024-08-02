package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.depth = 10;
        myBox1.height = 20;
        myBox1.width = 30;
        myBox1.volumePrint();

        myBox2.height = 40;
        myBox2.width = 50;
        myBox2.depth = 60;
        myBox2.volumePrint();

    }
}
