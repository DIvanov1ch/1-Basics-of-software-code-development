package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 3. Найти сумму квадратов первых ста чисел
 */

public class Loop3 {

    public static void main(String[] args) {

        int sum;

        sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += (i * i);
        }
        System.out.printf("Сумма квадратов первых ста чисел: %d", sum);
    }
}
