package chapter2;

public class Array {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 29;
        month_days[2] = 20;
        month_days[3] = 47;
        month_days[4] = 32;
        month_days[5] = 21;
        month_days[6] = 99;
        month_days[7] = 11;
        month_days[8] = 37;
        month_days[9] = 94;
        month_days[10] = 84;
        month_days[11] = 46;

        System.out.println(month_days[2]);
        month_days[2] = 54;
        System.out.println(month_days[2]);


    }
}
