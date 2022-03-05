package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Ветвления
 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, если да,
 то будет ли он прямоугольным
 */

public class Branching1 {

    public static void main(String[] args) {

        int a;
        int b;

        a = 160;
        b = 20;

        if ((a + b) >= 180) {
            System.out.println("Такого треугольника не существует");

        } else if ((a + b == 90) || (a == 90) || (b == 90)) {
            System.out.println("Прямоугольный треугольник");

        } else {
            System.out.println("Непрямоугольный треугольник");
        }

    }
}
