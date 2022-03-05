package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все
 числа от 1 до введенного пользователем числа
 */

import java.util.Scanner;

public class Loop1 {

    public static void main(String[] args) {

        int integer;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое положительное число: ");

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Введите целое положительное число: ");
        }

        integer = scan.nextInt();

        if (integer > 0) {
            int sum = 0;
            for (int i = 1; i <= integer; i++) {
                sum += i;
            }
            System.out.printf("Сумма чисел равна: %d", sum);
        } else {
            System.out.println("Вы ввели не положительное число");
        }


    }
}
