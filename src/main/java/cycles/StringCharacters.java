package cycles;

import java.util.Scanner;

/**
 * 5. Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
 * один символ)
 * Сложность алгоритма (1 способ) O(n)
 * Сложность алгоритма (2 способ) O(n)
 */

public class StringCharacters {

    //1 способ
    public static void printChars(String str) {
        str.chars()
                .forEach(c -> System.out.println((char) c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите любую строку (первый способ): ");
        String strFirst = input.nextLine();

        //2 способ
        for (int i = 0; i < strFirst.length(); i++) {
            System.out.println(strFirst.charAt(i));
        }

        System.out.print("Введите любую строку (второй способ): ");
        String strSecond = input.nextLine();

        printChars(strSecond);

        input.close();
    }
}