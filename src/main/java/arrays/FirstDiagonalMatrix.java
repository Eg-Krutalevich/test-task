package arrays;

import java.util.Random;

/**
 * 6. Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по
 * диагонали от [0][0] до [10][10]
 */

public class FirstDiagonalMatrix {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] a = new int[10][10];
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

        System.out.println("Элементы по диагонали от [0][0] до [10][10]:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
        }
    }
}