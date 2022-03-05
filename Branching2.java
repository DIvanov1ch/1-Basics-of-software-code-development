package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Ветвления
 2. Найти max{min(a, b), min(c, d)}
 */

public class Branching2 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int minAB;
        int minCD;
        int max;

        a = 12;
        b = 7;
        c = 1;
        d = 3;


        if (a <= b) {
            minAB = a;
        } else {
            minAB = b;
        }

        if (c <= d) {
            minCD = c;
        } else {
            minCD = d;
        }

        if (minAB > minCD) {
            max = minAB;
        } else {
            max = minCD;
        }

        System.out.printf("max{min(%d, %d), min(%d, %d)} = %d", a, b, c, d, max);
    }
}
