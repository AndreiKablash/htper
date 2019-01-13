import java.util.Scanner;

public class Lesson1 {

    private static final double G = 9.8; // symbol for gravitational acceleration, m2/c
    private static final double BY_SIXTEEN_PERCENT = 16 / 100; // symbol for gravitational acceleration, m2/c
    private static final int HOURS_IN_ONE_DAY= 24; //
    private static final int MINUTES_IN_ONE_HOUR= 60; //
    private static final int SECONDS_IN_ONE_HOUR= 60; //

    private static void convertRuToUsd(double roubles, double rate) {
        double dollars = roubles / rate;
        System.out.println("Your amount of dollars = " + dollars + " Usd");
    }

    public static void main(String[] args) {

        //Task1
        System.out.println("Task 1");
        double bodyMass = 67; // Your body mass, kg
        double weightOnEarth = G * bodyMass; // weight or gravity on Earth, N
        double weightOnMoon = weightOnEarth * BY_SIXTEEN_PERCENT; // weight or gravity on the Moon, N
        System.out.println("Your weigth on Earth - " + weightOnEarth + ", N");
        System.out.println("Your weigth on the Moon - " + weightOnMoon + ", N");

        //Task2
        System.out.println("Task 2");
        double mass[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < mass.length; i++) {
            mass[i] += mass[i] * 10 / 100;
            System.out.print(mass[i] + " ");
        }
        System.out.println();


        //Task3
        System.out.println("Task 3");
        int firstX = 12321;
        int secondX = firstX;
        int thirdX = 0;
        while (firstX / 10 != 0) {
            thirdX *= 10;
            thirdX += firstX % 10;
            firstX /= 10;
        }
        if (secondX == thirdX) {
            System.out.println("Your number is polindrome");
        } else
            System.out.println("Your number isn't polindrome");

        //Task4
        System.out.println("Task 4");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //Task5
        System.out.println("Task 5");
        for (int j = 1; j <= 15; j++) {
            if (j % 2 != 0)
                System.out.print(j + " ");
        }
        System.out.println();

        //Task6
        System.out.println("Task 6");
        int firstValue = 1;
        int lastValue = 100;
        for (int i = firstValue; i <= lastValue; i++) {
            if ((i & 1) == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //Task7
        System.out.println("Task 7");
        int firstValue1 = 1;
        int lastValue1 = 100;
        int count = 0;
        for (int i = firstValue1; i <= lastValue1; i++) {
            count += i;
        }
        System.out.print(count);
        System.out.println();

        //Task8
        System.out.println("Task 8");
        for (int i = 1; i <= 12; i++) {
            if (i == 1) System.out.println("number " + i + " January");
            else if (i == 2) System.out.println("number " + i + " February");
            else if (i == 3) System.out.println("number " + i + " March");
            else if (i == 4) System.out.println("number " + i + " April");
            else if (i == 5) System.out.println("number " + i + " May");
            else if (i == 6) System.out.println("number " + i + " June");
            else if (i == 7) System.out.println("number " + i + " July");
            else if (i == 8) System.out.println("number " + i + " August");
            else if (i == 9) System.out.println("number " + i + " September");
            else if (i == 10) System.out.println("number " + i + " October");
            else if (i == 11) System.out.println("number " + i + " November");
            else System.out.println("number " + i + " December");
        }

        //Task 9
        System.out.println("Task 9");
        int value1 = 1;
        int value2 = 3;
        int glass;
        glass = value1;
        value1 = value2;
        value2 = glass;
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        //Task 10
        System.out.println("Task 10");
        int valueQ1 = 3;
        int valueQ2 = 4;
        int sum = valueQ1 + valueQ2;
        System.out.println("sum = " + sum);


        /*Task11 (for case if number1==number2 || number1==number3 || number2==number3
        || for case if number1=number2=number3 )*/
        System.out.println("Task 11");
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 13;

        //all numbers are equal
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("all numbers are equal: number1= number2= number3: " + firstNumber);
            return;
        }

        //check for equal numbers
        if (firstNumber == secondNumber && firstNumber != thirdNumber) {
            if (secondNumber > thirdNumber)
                System.out.println("Max value is number1 and number2: " + firstNumber);
            else
                System.out.println("Max value is number3: " + thirdNumber);
        }
        if (firstNumber == thirdNumber && firstNumber != secondNumber) {
            if (firstNumber > secondNumber)
                System.out.println("Max value is number1 and number3: " + firstNumber);
            else
                System.out.println("Max value is number2: " + secondNumber);
        }
        if (secondNumber == thirdNumber) {
            if (secondNumber > firstNumber)
                System.out.println("Max value is number2 and number3: " + secondNumber);
            else
                System.out.println("Max value is number2: " + firstNumber);
        }

        //all numbers are different
        if (secondNumber != firstNumber && thirdNumber != firstNumber && secondNumber != thirdNumber) {

            if (firstNumber > secondNumber) {
                if (firstNumber > thirdNumber) {
                    System.out.println("Max value is number1: " + firstNumber);
                } else {
                    System.out.println("Max value is number3: " + thirdNumber);
                }
            } else {
                if (secondNumber > thirdNumber) {
                    System.out.println("Max value is number2: " + secondNumber);
                } else {
                    System.out.println("Max value is number3: " + thirdNumber);
                }
            }

        }

        //Task12
        System.out.println("Task 12");
        int a = 6, b = 1;
        boolean m = (a < b);
        boolean n = ((a - b) > 0);
        if (m)
            System.out.println("m= " + true);
        else
            System.out.println("m= " + false);
        if (n)
            System.out.println("n= " + true);
        else
            System.out.println("n= " + false);

        //Task13
        System.out.println("Task 13");
        String firstStroka = "Hello";
        String secondStroka = " java!";
        System.out.println(firstStroka + secondStroka);
        System.out.println(firstStroka.concat(secondStroka));

        //Task14
        System.out.println("Task 14");
        int numberA = 12;
        int numberB = 14;
        if (numberA > numberB) {
            System.out.println("numberA= " + (numberA + 3));
        } else
            System.out.println("numberB= " + (numberB + 8));
        if (numberA == numberB)
            System.out.println("numberA=numberB");


        //Task15
        System.out.println("Task 15");

        //from 1 to 100 by the use of for
        for (int i = 1; i <= 100; i++)
            System.out.print(i + " ");
        System.out.println();

        //from 1 to 100 by the ase of while
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //from 1 to 100 by the ase of do while
        i = 0;
        do {
            i++;
            System.out.print(i + " ");
        }
        while ((i + 1) <= 100);
        System.out.println();


        //Task 16
        System.out.println("Task 16");
        //input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int inputFirstV = scanner.nextInt();
        System.out.print("Enter last value: ");
        int inputLastV = scanner.nextInt();
        System.out.print("Enter step value: ");
        int inputStepV = scanner.nextInt();

        System.out.println("Your data array");

        //calculate the size of data array
        int size = (inputLastV - inputFirstV) / inputStepV + 1;
        //create data array
        int massive[] = new int[size];
        for (i = 0; i < size; i++) {
            massive[i] = inputFirstV + inputStepV * i;/*complete data array */
            System.out.print(massive[i] + "  "); /*display output of data array*/
        }
        System.out.println();


        //Task 17
        System.out.println("Task 17");
        double massiveQ[] = {5, 10, 5, 15, 30, 20};
        double ma = massiveQ[0];
        int j = 0;
        for (i = 0; i < massiveQ.length; i++) {
            if (ma < massiveQ[i]) {
                ma = massiveQ[i];
                j = i;
            }
        }
        System.out.println("Max value from array massive[" + j + "] = " + ma);

        for (i = 0; i < massiveQ.length; i++) {
            System.out.print((massiveQ[i] / ma) + " ");
        }
        System.out.println();


        //Task 18
        System.out.println("Task 18");
        double rate = 2.1100;
        double roubles = 211;
        convertRuToUsd(roubles, rate);

        //Advanced task
        System.out.println("Advanced task");
        int twentyFourHours = 7;
        System.out.println("twentyFourHours= " + twentyFourHours);
        int hours = twentyFourHours *HOURS_IN_ONE_DAY;
        System.out.println("hours= " + hours);
        int minutes = hours * MINUTES_IN_ONE_HOUR;
        System.out.println("minutes= " + minutes);
        int seconds = minutes * SECONDS_IN_ONE_HOUR;
        System.out.println("seconds = " + seconds);

    }
}
