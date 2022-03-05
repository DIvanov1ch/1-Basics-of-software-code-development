package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 6. Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
 */

public class Loop6 {

    public static void main(String[] args) {

        char ch;

        for (int i = 32; i <= 126; i++) {
            ch = (char) i;
            System.out.printf("%d - %c\t", i, ch);

            if (i == 41 ^ i == 51 ^ i == 61 ^ i == 71 ^ i == 81 ^ i == 91 ^ i == 101 ^ i == 111 ^ i == 121) {
                System.out.println();
            }
        }
    }
}
