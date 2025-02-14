package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Пользователь вводит в консоли два числа, выводим сообщение “первое число
 * больше/меньше, чем второе” в зависимости от результата их сравнения
 * Сложность алгоритма O(1)
 */

public class NumberComparator {

    public static String compareNumbers(int firstNumber, int secondNumber) {
        return (firstNumber > secondNumber) ? "Первое число больше, чем второе"
                : (firstNumber < secondNumber) ? "Первое число меньше, чем второе"
                : "Первое число равно второму";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                int firstNumber = input.nextInt();

                System.out.print("Введите второе число: ");
                int secondNumber = input.nextInt();

                String result = compareNumbers(firstNumber, secondNumber);
                System.out.println(result);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}