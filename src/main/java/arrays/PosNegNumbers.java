package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Дан массив с целыми числами. Вывести в консоль количество положительных и
 * отрицательных чисел в нем
 */

public class PosNegNumbers {

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

        System.out.println("Массив чисел: " + Arrays.toString(a));

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                positiveCount++;
            } else if (a[i] < 0) {
                negativeCount++;
            }
        }
        System.out.print("Количество положительных чисел в массиве: " + positiveCount);
        System.out.print("\nКоличество негативных чисел в массиве: " + negativeCount);
        input.close();
    }
}