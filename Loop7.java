package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 m и n вводятся с клавиатуры
 */

public class Loop7 {

    public static void main(String[] args) {

        int m;
        int n;

        m = 320;
        n = 330;

        for (int i = m; i <= n; i++) {
            System.out.printf("%d:", i);

            for (int j = 2; j <= (i / 2); j++) {
                if ((i % j) == 0) {
                    System.out.printf(" %d,", j);
                }
            }

            System.out.println();
        }
    }
}
