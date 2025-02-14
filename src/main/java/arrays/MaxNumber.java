package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4. Дан массив с целыми числами. Вывести в консоль наибольшее из них
 */

public class MaxNumber {

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

        int max = 0;
        int counterMax = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                counterMax = 1;
            } else if (a[i] == max) {
                counterMax++;
            }
        }

        if (counterMax > 1) {
            System.out.println("Максимальных элементов " + counterMax + " штук");
        } else {
            System.out.print("Максимальный элемент: " + max);
        }
        input.close();
    }
}