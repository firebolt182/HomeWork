package firebolt.example.homework2;

import firebolt.example.homework2.office.Runner;
import java.util.Arrays;
import java.util.Random;

public class Homework2 {

    public static void ex1() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};


        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        int tmp = arrayOfNumbers.length - 1;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
            for (int j = tmp; j > -1; ) {
                leftDownToRightUpSum += arrayOfNumbers[i][j];
                break;
            }
            tmp--;
        }

        System.out.println(leftUpToRightDownSum);
        System.out.println(leftDownToRightUpSum);

    }

    public static void ex2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void ex3() {
        Random random = new Random(1);
        int number = random.nextInt(1000);
        int count = 0;
        while (number != 999) {
            count++;
            number = random.nextInt(1000);
        }
        System.out.println(count);
    }

    public static void ex4() {
        firebolt.example.homework2.shop.Runner runner =
                new firebolt.example.homework2.shop.Runner();
        runner.show();
    }

    public static void ex5() {
        Runner runner = new Runner();
        runner.startWorkDay();
    }

}
