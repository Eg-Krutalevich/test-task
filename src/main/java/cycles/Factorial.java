package cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4. Пользователь вводит число. Выводим в консоль факториал этого числа
 * Сложность алгоритма с циклом O(n)
 * Сложность алгоритма с рекурсией O(n)
 */

public class Factorial {

    //1 способ с циклом
    public static int calculateFactorialCycle(int number) {
        int factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //2 способ с рекурсией
    public static int calculateFactorialRecursion(int number) {
        if (number == 0) {
            return 1;
        }
        return number * calculateFactorialRecursion(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите любое неотрицательное целое число (цикл): ");
                int numberCycle = input.nextInt();

                System.out.print("Введите любое неотрицательное целое число (рекурсия): ");
                int numberRecursion = input.nextInt();

                if (numberCycle < 0 || numberRecursion < 0) {
                    System.out.println("Пожалуйста, введите число от 0 и выше (цикл)");
                } else {
                    int factorialCycle = calculateFactorialCycle(numberCycle);
                    int factorialRecursion = calculateFactorialRecursion(numberRecursion);

                    System.out.println("Факториал числа " + numberRecursion + " равен: " + factorialCycle);
                    System.out.println("Факториал числа " + numberRecursion + " равен: " + factorialRecursion);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное неотрицательное целое число.");
                input.next();
            }
        }
        input.close();
    }
}