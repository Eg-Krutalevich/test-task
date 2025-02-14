package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3. Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
 * значения)
 */

public class SumEvenNumbers {

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
        boolean isEvenNumbers = false;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
                isEvenNumbers = true;
            }
        }

        if (isEvenNumbers) {
            System.out.print("Сумма четных элементов: " + sum);
        } else {
            System.out.println("Четные элементы не найдены");
        }
        input.close();
    }
}