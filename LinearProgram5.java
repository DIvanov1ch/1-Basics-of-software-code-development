package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Линейные программы
 5. Дано натуральное число, которое представляет длительность прошедшего времени в секундах.
 Вывести данное значение в длительности в часах, минутах и секундах.
 */

public class LinearProgram5 {

    public static void main(String[] args) {

        int time;
        int hours;
        int minutes;
        int seconds;

        time = 55000;

        hours = time / 3600;
        minutes = (time - 3600 * hours) / 60;
        seconds = time - 3600 * hours - minutes * 60;

        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");

    }
}
