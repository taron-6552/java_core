package chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Constructor1 myBox1 = new Constructor1(20, 10, 30);
        Constructor1 myBox2 = new Constructor1(40, 50, 60);
        double vol;


        vol = myBox1.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);
    }
}
