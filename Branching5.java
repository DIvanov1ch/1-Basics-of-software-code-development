package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Ветвления
 5. Вычислить значение функции
 */

public class Branching5 {

    public static void main(String[] args) {

        double x;
        double fx;

        x = 1;

        fx = x <= 3 ? (Math.pow(x, 2) - 3 * x + 9) : (1 / (Math.pow(x, 3) + 6));

        System.out.println("Значение функции F(x) = " + fx);
    }
}
