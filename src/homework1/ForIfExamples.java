package homework1;

public class ForIfExamples {
    public static void main(String[] args) {
        // number loop
        for (int i = 1; i < 11;i ++){
            System.out.println(i);
        }

        // summary numbers
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);


        // reverse numbers
        System.out.println();
        for (int i = 50; i > 0; i-- ){
            System.out.println(i);
        }

        // odd numbers
        System.out.println();
        int x = 20;
        while (x > 0) {
            if (x == x / 2 * 2){
                System.out.println(x);
            }
            x--;
        }

        // even numbers
        System.out.println();
        int y = 1;
        while (y < 101) {
            if (y == y / 2 * 2){
                System.out.println(y);
            }
            y++;
        }


    }
}