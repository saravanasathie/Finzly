package com.javabykiran.Assignments_01;

class ExerciseForLoop {

    void exercise1() {
        // Program To print 1 to 25 nos.
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise2() {
        // Program To print 25 to 1 nos.
        for (int i = 25; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    void exercise3() {
        // Program To print 1 to 100 Odd nos.
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise4() {
        // Program To print 1 to 100 even nos.
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise5() {
        // Program To print sum of 1 to 50 Odd nos.
        int sum = 0;
        for (int i = 1; i <= 50; i += 2) {
            sum += i;
        }
        System.out.print("Sum of odd number = " + sum);
        System.out.println();
    }

    void exercise6() {
        // Program To print sum of 1 to 50 EVEN nos.
        int sum = 0;
        for (int i = 0; i <= 50; i += 2) {
            sum += i;
        }
        System.out.print("Sum of even number = " + sum);
        System.out.println();
    }

    void exercise7() {
        // Program To print -45 to +45 nos.
        for (int i = -45; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise8() {
        // Program To print 50 to 100 nos.
        for (int i = 50; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise9() {
        // Program To print sum of odd and even no.
        int sumOfOdd = 0, sumOfEven = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                sumOfEven += i;
            else
                sumOfOdd += i;
        }
        System.out.println("Sum of even = " + sumOfEven + " Sum of odd = " + sumOfOdd);

    }

    void exercise10() {
        // Program To print even and odd No
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.println(i + " even ");

            else
                System.out.println(i + " odd ");
        }
    }

    void exercise11() {
        // Program To print 1 to 100 no.
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise12() {
        // Program To print 100 to 1 no.
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise13() {
        // Program To print 30 to 50 no.
        for (int i = 30; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    void exercise14() {
        // Program To print count of even No 1 to 25 no.
        int countOfEven = 0;
        for (int i = 1; i <= 25; i++) {
            if (i % 2 == 0)
                countOfEven += 1;
        }
        System.out.println("Count Of Even : " + countOfEven);
    }

    void exercise15() {
        // Program To print count of odd No 1 to 25 no.
        int countOfOdd = 0;
        for (int i = 1; i <= 25; i++) {
            if (i % 2 != 0)
                countOfOdd += 1;
        }
        System.out.println("Count Of Odd : " + countOfOdd);

    }

    void exercise16() {
        // Series... 2 4 6 8 10 12 14 16 18 20.
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise17() {
        // Series... 9 18 27 36 45 54 63 72 81 90.
        for (int i = 9; i <= 90; i += 9) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise18() {
        // Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise19() {
        // Series... 5 10 15 20 25 30 35 40 45 50.
        for (int i = 5; i < 51; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise20() {
        // Series... 1 10 100 1000.
        for (int i = 1; i <= 1000; i = i * 10) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise21() {
        // Series... 1 3 6 10 15 21 28 36 45.
        int b = 0;
        for (int i = 1; i < 10; i++) {
            b = b + i;
            System.out.print(b + " ");

        }
        System.out.println();
    }

    void exercise22() {
        // Series... 8 16 24 32 40 48 56 64 72 80.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * 8 + " ");
        }
        System.out.println();
    }

    void exercise23() {
        // Series... 0 1 1 2 3 5 8 13 21.
        int a = 0, g = 1, c;
        System.out.print(a + " " + g + " ");
        for (int i = 0; i < 10; i++) {
            c = a + g;
            System.out.print(c + " ");
            a = g;
            g = c;
        }
        System.out.println();

    }

    void exercise24() {
        // series... 1 4 9 16 25 36 49 64 81 100.
        int sum1 = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                sum1 += i;
                System.out.print(sum1 + " ");
            }

        }
        System.out.println();
    }

    void exercise25() {
        // series... 3 6 9 12 15 18 21 24 27 30.
        for (int i = 3; i <= 30; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise26() {
        // Series... 7 14 21 28 35 42 49 56 63 70.
        for (int i = 7; i <= 70; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise27() {
        // Series... 4 8 12 16 20 24 28 32 36 40.
        for (int i = 4; i <= 40; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise28() {
        // Series... 10 20 30 40 50 60 70 80 90 100.
        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exercise29() {
        // Series... 1 2 3 4 5 4 3 2 1.
        for (int i = 1; i < 5; i++) {
            System.out.print(i + " ");
        }
        for (int j = 5; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void exercise30() {
        // Series... 6 12 18 24 30 36 42 48 54 60.
        for (int i = 6; i <= 60; i += 6) {
            System.out.print(i + " ");
        }
    }
}

public class ForLoops {
    public static void main(String[] args) {
        ExerciseForLoop e = new ExerciseForLoop();

        e.exercise1();
        e.exercise2();
        e.exercise3();
        e.exercise4();
        e.exercise5();
        e.exercise6();
        e.exercise7();
        e.exercise8();
        e.exercise9();
        e.exercise10();
        e.exercise11();
        e.exercise12();
        e.exercise13();
        e.exercise14();
        e.exercise15();
        e.exercise16();
        e.exercise17();
        e.exercise18();
        e.exercise19();
        e.exercise20();
        e.exercise21();
        e.exercise22();
        e.exercise23();
        e.exercise24();
        e.exercise25();
        e.exercise26();
        e.exercise27();
        e.exercise28();
        e.exercise29();
        e.exercise30();
    }
}
