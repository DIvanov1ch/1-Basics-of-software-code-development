package by.epam.trukhanovich.basic;

/*
(1). Basics of software code development
 Линейные программы
 3. Вычислить значение выражения по формуле
 */

public class LinearProgram3 {

    public static void main(String[] args) {

        double x;
        double y;
        double value;

        x = 20;
        y = 180;

        value = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.printf("Значение выражения: %.3f \n", value);
    }
}
