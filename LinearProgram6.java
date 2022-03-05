package by.epam.trukhanovich.basic;

/*
(1). Basics of software code development
Линейные программы
 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
 принадлежит закрашенной области, и false - в противном случае
 */

public class LinearProgram6 {

    public static void main(String[] args) {

        int x;
        int y;
        boolean check;

        x = -2;
        y = 4;

        check = ((x >= -4 & x <= 4) && (y >= -3 & y <= 0)) | ((x >= -2 & x <= 2) && (y >= 0 & y <= 4));

        System.out.println(check);
    }
}
