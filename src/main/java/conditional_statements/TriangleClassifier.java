package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3. Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
 * сообщение, является ли треугольник равнобедренным, равносторонним или
 * разносторонним.
 * Сложность алгоритма O(1)
 */

public class TriangleClassifier {

    public static String classifyTriangle(double a, double b, double c) {
        boolean isTriangle = (a + b > c) & (b + c > a) & (a + c > b);

        if (!isTriangle) {
            return "Данная фигура не является треугольником";
        }
        if (a < 1 || b < 1 || c < 1) {
            return "Введенные числа отрицательные";
        }

        return (a == b && b == c) ? "Треугольник равносторонний"
                : (a == b || b == c || a == c) ? "Треугольник равнобедренный"
                : "Треугольник разносторонний";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите длину первой стороны: ");
                double a = input.nextDouble();

                System.out.print("Введите длину второй стороны: ");
                double b = input.nextDouble();

                System.out.print("Введите длину третьей стороны: ");
                double c = input.nextDouble();

                String result = classifyTriangle(a, b, c);
                System.out.println(result);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное положительное число");
                input.next();
            }
        }
        input.close();
    }
}