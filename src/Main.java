//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "зиме";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "весне";

        } else if (month == 6 || month == 7 || month == 8) {
            season = "лету";

        } else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else {
            season = "вымышленным месяцам";
        }

        System.out.println(season);
    }
}