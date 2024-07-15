package homework1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        // all numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // print array first element
        System.out.println();
        System.out.println(numbers[0]);

        // print array last element
        int lastElement = numbers[numbers.length - 1];
        System.out.println(lastElement);

        // print array length
        System.out.println(numbers.length);

        // print min number array
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);


        // print array middle number or numbers
        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        } else if (numbers.length % 2 == 0) {
            int j = numbers.length;
            for (int i = 0; i < numbers.length; i++) {
                j--;
                if (i - j == 1) {
                    System.out.println(numbers[i]);
                    System.out.println(numbers[j]);
                }

            }
        } else {
            int j = numbers.length;
            for (int i = 0; i < numbers.length; i++) {
                j--;
                if (i == j) {
                    System.out.println(numbers[j]);
                }

            }
        }


        // print even numbers count
        int countEvenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        System.out.println(countEvenNumbers);

        // print odd numbers count in array;
        int countOddNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                countOddNumbers++;
            }
        }
        System.out.println(countOddNumbers);


        // print array elements summary
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);


        // print array elements average summary
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average = average + numbers[i];
        }
        System.out.println(average / numbers.length);

    }


}
