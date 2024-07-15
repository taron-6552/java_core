package chapter2;

public class Average {
    public static void main(String[] args) {
        double[] nums = {22.1, 33.9, 48.5, 56.5};
        double results = 0;
        for (int i = 0; i < nums.length; i++) {
            results = results + nums[i];
            System.out.println(results/nums.length);

        }
    }
}
