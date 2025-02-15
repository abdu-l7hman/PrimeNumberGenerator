/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs285.github;

import java.util.Scanner;

/**
 *
 * @author abdul
 */
public class Cs285Github {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello Wecolme in CS285 Project ");
        System.out.println("Enter 1 for statistics 2 for details about specific function");
        int chose = sc.nextInt();
        int input = 0;
        if (chose == 2) {
            do {
                System.out.println("-------------------------Home ____________________Page");
                System.out.println("Enter the number of the function\n from 1 to 10 (0 to exit)");
                input = sc.nextInt();

                if (input == 0) {
                    System.out.println("System exit, Thanks for usein our sestem -_-");
                    break;
                } else if (input < 0 || input > 11) {
                    System.out.println("ERROUR IN INPUT PLEAS TRY AGINE WITH NUMBER BETWEEN 1 TO10");
                } else {
                    TestFunc(input);
                    System.out.println(getFunctionName(input));
                }

            } while (true);
        } else if (chose == 1) {
            mostPrime();
            LargestPrime();
            fastest();
            firstNonPrimeGenerator();
        }
    }

    private static void firstNonPrimeGenerator() {
        for (int i = 0; i < 10; i++) { // Iterate through all formulas
            for (int n = 0; n < 10000; n++) { // Iterate through values of n
                long value = functions(i, n);
                if (!checkprime(value)) { // Check if the value is non-prime
                    System.out.println("The first formula to generate a non-prime number is "
                            + getFunctionName(i) + " with n = " + n + ". The non-prime number is " + value);
                    return;
                }
            }
        }
        System.out.println("All formulas generated prime numbers within the tested range.");
    }

    private static void TestFunc(int z) {
        long startTime = System.nanoTime(); // Start time
        long testNum = 0;
        long HighNum = 0;
        int counter = 0;
        //time1
        for (int i = 0; i < 10000; i++) {
            testNum = functions(z, i);
            if (checkprime(testNum)) {
                counter++;
            }
            if (testNum > HighNum) {
                HighNum = testNum;
            }
        }
        long endTime = System.nanoTime();   // End time
        long duration = endTime - startTime; // Duration in nanoseconds
        //time2
        System.out.println("The highest prime number is: " + HighNum + ".\nThe number of primes are " + counter + ".\nThe time is " + duration + " nano second");
    }

    private static boolean checkprime(long x) {

        int t = (int) (Math.sqrt(x));
        for (int i = 2; i < t; i++) {
            if (x % i == 0 && x != i) {
                return false;
            }
        }
        return true;
    }

    private static long functions(int input, int n) {
        switch (input) {
            case 0:
                return 4 * (n * n * n * n * n - 133 * n * n * n * n + 6729 * n * n * n - 158379 * n * n + 1720294 * n - 6823316);
            case 1:
                return 36 * (n * n * n * n * n * n - 126 * n * n * n * n * n + 6217 * n * n * n * n - 153066 * n * n * n + 1987786 * n * n - 13055316 * n + 34747236);
            case 2:
                return n * n * n * n - 97 * n * n * n + 3294 * n * n - 45458 * n + 213589;
            case 3:
                return n * n * n * n * n - 99 * n * n * n * n + 3588 * n * n * n - 56822 * n * n + 348272 * n - 286397;
            case 4:
                return -66 * n * n * n + 3845 * n * n - 60897 * n + 251831;
            case 5:
                return 36 * n * n - 810 * n + 2753;
            case 6:
                return 3 * n * n * n - 183 * n * n + 3318 * n - 18757;
            case 7:
                return 47 * n * n - 1701 * n + 10181;
            case 8:
                return 103 * n * n - 4707 * n + 50383;
            case 9:
                return n * n - n + 41;
            case 10:
                return 42 * n * n * n + 270 * n * n - 26436 * n + 250703;
            default:
                throw new IllegalArgumentException("Invalid function number");
        }

    }

    public static String getFunctionName(int functionNumber) {
        switch (functionNumber) {
            case 0:
                return "4 * (n^5 - 133n^4 + 6729n^3 - 158379n^2 + 1720294n - 6823316)";
            case 1:
                return "36 * (n^6 - 126n^5 + 6217n^4 - 153066n^3 + 1987786n^2 - 13055316n + 34747236)";
            case 2:
                return "n^4 - 97n^3 + 3294n^2 - 45458n + 213589";
            case 3:
                return "n^5 - 99n^4 + 3588n^3 - 56822n^2 + 348272n - 286397";
            case 4:
                return "-66n^3 + 3845n^2 - 60897n + 251831";
            case 5:
                return "36n^2 - 810n + 2753";
            case 6:
                return "3n^3 - 183n^2 + 3318n - 18757";
            case 7:
                return "47n^2 - 1701n + 10181";
            case 8:
                return "103n^2 - 4707n + 50383";
            case 9:
                return "n^2 - n + 41";
            case 10:
                return "42n^3 + 270n^2 - 26436n + 250703";
            default:
                throw new IllegalArgumentException("Invalid function number");
        }
    }

    private static void mostPrime() {
        int LargestNumOfPrimes = 0;
        int NumberOfFunction = 0;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 10000; j++) {
                long func = functions(i, j);
                if (checkprime(func)) {
                    count++;
                }
            }
            if (count > LargestNumOfPrimes) {
                LargestNumOfPrimes = count;
                NumberOfFunction = i;
            }
        }
        System.out.println("the function with Largest number of primes is " + getFunctionName(NumberOfFunction) + " The number of primes is " + LargestNumOfPrimes);
    }

    private static void LargestPrime() {
        long LargestPrime = 0;
        int FunctionOfLargesetPrime = 0;
        for (int i = 0; i < 10; i++) {
            long largPrimeOfFunction = 0;
            for (int j = 0; j < 10000; j++) {
                long func = functions(i, j);
                if (func > largPrimeOfFunction) {
                    largPrimeOfFunction = func;
                }
            }
            if (largPrimeOfFunction > LargestPrime) {
                LargestPrime = largPrimeOfFunction;
                FunctionOfLargesetPrime = i;
            }
        }
        System.out.println("the function with Largest prime is " + getFunctionName(FunctionOfLargesetPrime) + " The number is " + LargestPrime);
    }

    private static void fastest() {
        long leastTime = Long.MAX_VALUE;
        int numOfFunctionLeastTime = 0;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            long startTime = System.nanoTime(); // Start time
            for (int j = 0; j < 10000; j++) {
                long func = functions(i, j);
                if (checkprime(func)) {
                    count++;
                }
            }
            long endTime = System.nanoTime(); // Start time
            long duration = endTime - startTime;
            if (duration < leastTime) {
                leastTime = duration;
                numOfFunctionLeastTime = i;
            }
        }
        System.out.println("the function with least time is " + getFunctionName(numOfFunctionLeastTime) + " The time is " + leastTime + " ns");
    }
}
