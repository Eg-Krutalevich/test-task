package arrays;

import java.util.Random;

public class SumColumns {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходная матрица:");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        int maxSum = Integer.MIN_VALUE;
        int[] sumEach = new int[a[0].length];

        for (int i = 0; i < a[0].length; i++) {
            int columnSum = 0;

            for (int[] array : a) {
                columnSum += array[i];
            }
            sumEach[i] = columnSum;
            if (columnSum > maxSum) {
                maxSum = columnSum;
            }
        }

        System.out.println("Суммы по столбцам:");
        for (int i = 0; i < sumEach.length; i++) {
            System.out.println("Сумма столбца " + (i + 1) + ": " + sumEach[i]);
        }

        System.out.print("Максимальная сумма: " + maxSum);
    }
}