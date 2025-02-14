package cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3. Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
 * индексом х
 * Сложность алгоритма O(n)
 */

public class Fibonacci {

    public static int printFibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        int a = 0, b = 1;
        int fibNumber = 0;

        for (int i = 2; i <= x; i++) {
            fibNumber = a + b;
            a = b;
            b = fibNumber;
        }

        return fibNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите любой индекс числа Фибоначчи: ");
                int x = input.nextInt();

                if (x < 0) {
                    System.out.println("Пожалуйста, введите число от 0 и выше");
                }
                else {
                    int fibonacciNumber = printFibonacci(x);
                    System.out.println("Число Фибоначчи с индексом " + x + ": " + fibonacciNumber);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}