package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 8. Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
 * товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
 * хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
 * [сумма сдачи]”
 */

public class Shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Добро пожаловать в Евроопт!");
                System.out.println("Товары по скидке:" +
                        "\n1. Молоко (0.9 л) - 2.50 BYN" +
                        "\n2. Бананы (1 кг) - 4.50 BYN" +
                        "\n3. Хлеб (550 г) - 1.27 BYN" +
                        "\n4. Яблоки (1 кг) - 2.40 BYN" +
                        "\n5. Колбаса Докторская (0,8 кг) - 13 BYN");

                double price = 0.0;
                boolean validChoice = false;

                while (!validChoice) {
                    System.out.print("Введите индекс товара из списка: ");
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            price = 2.5;
                            validChoice = true;
                            break;
                        case 2:
                            price = 4.5;
                            validChoice = true;
                            break;
                        case 3:
                            price = 1.27;
                            validChoice = true;
                            break;
                        case 4:
                            price = 2.4;
                            validChoice = true;
                            break;
                        case 5:
                            price = 13;
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Выберите верную позицию от 1 до 5");
                    }
                }

                System.out.print("Введите количество выбранного товара: ");
                int count = input.nextInt();

                System.out.print("Введите сумму денег: ");
                int money = input.nextInt();

                if (money < price * count) {
                    System.out.println("Операция отклонена");
                } else if (money == price * count) {
                    System.out.println("Оплата прошла успешно");
                } else {
                    double change = money - price * count;
                    System.out.println("Ваша сдача: " + change + " BYN");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}