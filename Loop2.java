package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 2. Вычислить значение функции на отрезке [a, b] с шагом h
 */

public class Loop2 {

    public static void main(String[] args) {

        int a;
        int b;
        int h;
        double x;
        double y;

        a = -9;
        b = 10;
        h = 2;

        for (int i = a; i <= b; i += h) {
            x = i;
            y = x <= 2 ? -x : x;
            System.out.println("y = " + y);
        }
    }
}
