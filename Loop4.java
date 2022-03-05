package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 4. Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Loop4 {

    public static void main(String[] args) {

        long product;

        product = 1;

        for (int i = 1; i <= 200; i++) {
            product *= Math.pow(i, 2);

            if (product >= Long.MAX_VALUE) {
                System.out.println("Невозможно произвести расчет. Превышен предел для типа данных long");
                System.out.println("Число, на котором возникло переполнение: " + i);
                break;
            }
        }
    }
}
