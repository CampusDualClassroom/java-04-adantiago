package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

    }

    public static int sumNum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumNum(num - 1);
        }
    }

    public static int sumEvenNum(int num) {
        int evens = 0;
        int toRet = 0;
        int index = 1;
        while (evens < num) {
            if (index % 2 == 0) {
                toRet += index;
                ++evens;
            }
            ++index;
        }
        return toRet;
    }

    public static int factorial(int num) {
        return recursiveFactorial(num);
    }

    public static int recursiveFactorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
