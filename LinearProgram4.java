package by.epam.trukhanovich.basic;

/*
(1). Basics of software code development
 Линейные программы
 4. Дано действительное число R вида nnn.ddd. Поменять местами дробную и челую части и вывести результат
 */

public class LinearProgram4 {

    public static void main(String[] args) {

        double R;
        R = 123.321;

        int integerPart;
        float decimalPart;
        double newR;

        integerPart = (int) R;
        decimalPart = (float) ((R - integerPart) * 1000);
        newR = decimalPart + integerPart / 1000.0;

        System.out.println(newR);

    }
}
