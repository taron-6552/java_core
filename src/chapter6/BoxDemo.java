package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 20;
        myBox.height = 30;
        myBox.depth = 15;

        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("Vol box :" + vol);
    }
}
