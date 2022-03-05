package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Ветвления
 4. Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить,
пройдет ли кирпич через отверстие
 */

public class Branching4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int x = 9;
        int y = 3;
        int z = 1;

        if (((a > x) & (b > y)) || ((a > y) & (b > x)) ||
                ((a > x) & (b > z)) || ((a > z) & (b > x)) ||
                ((a > z) & (b > y)) || ((a > y) & (b > z))) {
            System.out.println("Кирпич проходит через отверстие");
        } else {
            System.out.println("Кирпич не проходит");
        }
    }

}
