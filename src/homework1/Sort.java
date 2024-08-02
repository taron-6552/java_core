package homework1;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {2, 20, 3, 5, 1, 12, 39, 9, 8, 6, 122};
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int x = 0;
                if (numbers[i] > numbers[i + 1]) {
                    x = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = x;
                }
            }


        }
        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }
}
