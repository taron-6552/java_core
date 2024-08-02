package chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.depth = 10;
        myBox1.height = 20;
        myBox1.width = 30;

        myBox2.width = 40;
        myBox2.height = 50;
        myBox2.depth = 60;


        vol = myBox1.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);


    }


}
