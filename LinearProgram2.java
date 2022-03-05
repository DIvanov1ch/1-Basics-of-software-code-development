package by.epam.trukhanovich.basic;

/*
(1). Basics of software code development
 Линейные программы
 2. Вычислить значение выражения по формуле
 */

public class LinearProgram2 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double value;

        a = 3;    // a != 0;
        b = 5;
        c = 9;

        value = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2.0 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.printf("Значение выражения: %.3f \n", value);
    }
}


