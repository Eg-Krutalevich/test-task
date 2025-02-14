package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 5. Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
 * таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
 * соответствующее сообщение.
 */

public class FrequentNumber {

    public static void findMostFrequent(int[] array) {
        int[] frequency = new int[100];
        int maxCount = 0;
        int mostFrequentNum = Integer.MIN_VALUE;

        for (int num : array) {
            frequency[num]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequentNum = i;
            } else if (frequency[i] == maxCount) {
                mostFrequentNum = Math.max(mostFrequentNum, i);
            }
        }

        if (maxCount > 1) {
            System.out.println("Наиболее часто встречающееся число: " + mostFrequentNum);
        } else {
            System.out.println("Повторяющихся чисел нет.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (n < 1) {
            try {
                System.out.print("Введите количество элементов массива: ");
                n = input.nextInt();

                if (n < 1) {
                    System.out.println("Количество элементов должно быть положительным числом. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }

        int[] a = new int[n];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        findMostFrequent(a);
        input.close();
    }
}