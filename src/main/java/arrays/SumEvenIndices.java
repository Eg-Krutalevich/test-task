package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
 */

public class SumEvenIndices {

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

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.print("Сумма элементов на четных позициях: " + sum);
        input.close();
    }
}