package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.depth = 10;
        myBox1.width = 20;
        myBox1.height = 30;
        
        myBox2.height = 40;
        myBox2.width = 50;
        myBox2.depth = 60;

        vol = myBox1.depth * myBox1.height * myBox1.width;
        System.out.println(vol);

        vol = myBox2.depth * myBox2.height * myBox2.width;
        System.out.println(vol);
    }
}
