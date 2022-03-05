package by.epam.trukhanovich.basic;

/*
 (1). Basics of software code development
 Циклы
 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */

public class Loop8 {

    public static void main(String[] args) {
        
        int a;
        int b;
        int absA;
        int absB;

        a = 356;
        b = -1623;

        absA = Math.abs(a);
        absB = Math.abs(b);

        System.out.println("Цифры, входящие в состав обоих чисел: ");

        while (absA > 0) {
            int digitOfA = absA % 10;
            absA /= 10;

            while (absB > 0) {
                int digitOfB = absB % 10;
                if (digitOfB == digitOfA) {
                    System.out.print(digitOfB + " ");
                }
                absB /= 10;
            }
            absB = Math.abs(b);
        }

    }
}
