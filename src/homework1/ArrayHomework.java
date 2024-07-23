package chapter2;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 92, 66, 43, 29, 69, 6, 65};

//         print number count
        int count = 0;
        for (int element : numbers) {
            if (element == 6) {
                count++;
            }
        }
        System.out.println(count);

        // reverse array

        int[] reversNumbers = new int[numbers.length + 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversNumbers[i] = numbers[i];
            System.out.print(reversNumbers[i] + " ");
        }

        int countDublicateNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[i] == numbers[j]) {
                    countDublicateNumbers++;
                }
            }

        }
        System.out.println();
        System.out.println(countDublicateNumbers);

        // char array
        int countchars = 0;
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ',};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ո' && chars[i + 1] == 'ւ') {
                countchars++;
            } else if (chars[i] == 'ա' || chars[i] == 'ո' || chars[i] == 'ի' || chars[i] == 'և' || chars[i] == 'օ' || chars[i] == 'ե' || chars[i] == 'է') {
                countchars++;
            }
        }
        System.out.println(countchars);
    }
}
