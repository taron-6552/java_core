package homework1;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {

                    System.out.print("* ");



            }
            System.out.println();
//            System.out.println("i :" + i);

            if(i == 1){
                System.out.print(" ");
            }
            if(i == 2){
                System.out.print("");
            }
            if(i == 3){
                System.out.print("");
            }
        }
        System.out.println();


        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {

                System.out.print("* ");

            }
            System.out.println();
            if(i == 0){
                System.out.print("  ");
            }
            if(i == 1){
                System.out.print("    ");
            }
            if(i == 2){
                System.out.print("      ");
            }
            if(i == 3){
                System.out.print("        ");
            }

        }
    }
}
