package by.epam.trukhanovich.basic;

/*
  (1). Basics of software code development
 Циклы
 5. Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых
больше или равен заданному e.
 */

public class Loop5 {

    public static void main(String[] args) {

        double e;
        double size;
        double sum;
        double an;

        e = 0.1;
        size = 10;
        sum = 0;

        for (int n = 1; n < size; n++) {
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            System.out.println(an);

            if (Math.abs(an) >= e) {
                sum += an;
            }

        }
        System.out.println("Сумма: " + sum);

    }
}
