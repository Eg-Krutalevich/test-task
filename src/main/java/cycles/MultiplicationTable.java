package cycles;

import java.util.stream.IntStream;

/**
 * 1. Вывести в консоль таблицу умножения на 4
 * Сложность алгоритма с циклом O(n)
 * Сложность алгоритма с Stream O(n)
 */

public class MultiplicationTable {

    public static void printMultiplicationTableStream() {
        IntStream.rangeClosed(1, 10)
                .mapToObj(i -> "4 x " + i + " = " + (4 * i))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        System.out.println("Таблица умножения на 4 (способ с циклом):");
        for (int i = 1; i < 11; i++) {
            int result = 4 * i;
            System.out.println("4 x " + i + " = " + result);
        }

        System.out.println("Таблица умножения на 4 (способ с Stream):");
        printMultiplicationTableStream();
    }
}