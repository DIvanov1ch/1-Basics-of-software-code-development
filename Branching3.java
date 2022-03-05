package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Ветвления
 3. Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
Определить, будут ли они расположены на одной прямой
 */

public class Branching3 {

    public static void main(String[] args) {

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        x1 = 1;
        y1 = 1;

        x2 = 3;
        y2 = 3;

        x3 = -10;
        y3 = -5;

        if (((x3 - x1) * (y2 - y1)) == ((x2 - x1) * (y3 - y1))) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }

    }
}
