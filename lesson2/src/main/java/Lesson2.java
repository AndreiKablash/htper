import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1");
        //sort with arrays class
        //search method
        System.out.println("search");
        int num[] = {2, 7, 4, 5, 6, 9, 1, 3, 8};
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            int tmp = num[min];
            num[min] = num[i];
            num[i] = tmp;
            System.out.print(num[i] + " ");
        }
        System.out.println();

        //"Bubble" method
        System.out.println("Bubble");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
            System.out.print(num[i] + " ");
        }
        System.out.println();

        //Arrays.sort
        System.out.println("Arrays.sort");

        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i + "  ");
        }

        System.out.println();

        //String sort
        System.out.println("String:");
        String names[] = {"Anna", "Sam", "Petter", "Anton", "Sam"};
        Arrays.sort(names);
        for (String s : names) {
            System.out.print(s + " ");
        }

        System.out.println();

        //Task2
        System.out.println("Task 2");

        int[] myArray = {2, 1, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            count += myArray[i];
        }
        System.out.println("Sum values of an array " + count);

        //Task3
        System.out.print("Task 3");
        char[] myCharArray = new char[10];
        for (int i = 0; i < (myCharArray.length - 5); i++) {
            System.out.println(" ");
            for (int j = 0; j < myCharArray.length; j++) {
                myCharArray[j] = '-';
                System.out.print(myCharArray[j]);
            }
        }
        System.out.println();

        //Task4
        System.out.println("Task 4");

        int[] myArray1 = {2, 1, 3, 4, 5};
        int middleValue = 0;
        int sum = 0;
        for (int i = 0; i < myArray1.length; i++) {
            sum += myArray1[i];
        }
        middleValue = sum / myArray1.length;
        System.out.println("middleValue = " + middleValue);

        //Task5
        System.out.println("Task 5");
        int[] yearsBase = {
                1931, 2002, 1890,
                334, 2003, 1932,
                1457, 2001, 2002};
        int specificelement = 2003;
        int n = 0;
        for (int i : yearsBase
        ) {
            if (i == specificelement) {
                n = 1;
                break;
            }
        }
        if (n == 1) {
            System.out.println("Array contains a sprecific element -" + true);
        } else System.out.println("Array contains a sprecific element -" + false);

        //Task6
        System.out.println("Task 6");
        int[] mark = {4, 5, 8, 6, 7, 9};
        int value = 8, k;
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == value) {
                k = i;
                System.out.println("for value=" + value + " index=" + k);
                break;
            }
        }

        //Task7 to remote a specific element
        System.out.println("Task 7");
        String[] forKitchen = {"folk", "guitar", "spoon", "plate", "cooking", "folk"};
        System.out.println("Original array: " + Arrays.toString(forKitchen));
        String remote = "guitar";
        int m = 0;
        for (int i = 0; i < forKitchen.length; i++) {
            if (forKitchen[i].compareTo(remote) == 0) {
                m = i;
                break;
            }
        }
        for (int i = m; i < forKitchen.length - 1; i++) {
            forKitchen[i] = forKitchen[i + 1];
        }
        System.out.println("After remote array forKitchen " + Arrays.toString(forKitchen));

        //Task8
        System.out.println("Task 8");
        int[] yearBaseA = new int[yearsBase.length];
        System.out.print("New array yearBaseA = { ");
        for (int i = 0; i < yearsBase.length; i++) {
            yearBaseA[i] = yearsBase[i];
            System.out.print(yearsBase[i] + " ");
        }
        System.out.println("}");
        System.out.println();

        //Task9
        System.out.println("Task 9");
        int numberA = 6; //number elements in array
        int pos = 3; //pos where you want to insert element
        int element = 3; //element to insert
        int[] array_a = new int[numberA + 1];
        for (int i = 0; i < numberA; i++) {
            array_a[i] += i;
        }
        System.out.println("Array before insert" + Arrays.toString(array_a));
        for (int i = (numberA - 1); i >= (pos - 1); i--) {
            array_a[i + 1] = array_a[i];
        }
        array_a[pos - 1] = element;
        System.out.println("Array after insert" + Arrays.toString(array_a));

        //Task10
        System.out.println("Task 10");
        int intermed = yearsBase[0];
        for (int i = 0; i < yearsBase.length; i++) {
            if (intermed < yearsBase[i]) {
                intermed = yearsBase[i];
            }
        }
        System.out.println("Maximum value =" + intermed);

        for (int i = 0; i < yearsBase.length; i++) {
            if (intermed > yearsBase[i]) {
                intermed = yearsBase[i];
            }
        }
        System.out.println("Minimum value =" + intermed);


        //Task11
        System.out.println("Task 11");

        int marks[] = new int[10];
        System.out.print("int marks[]={");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 20);
            System.out.print(marks[i] + " ");
        }
        System.out.println("}");
        System.out.print("reverse int mark[]={");
        int r;
        for (int j = 0; j < marks.length; j++) {
            r = j;
            if (r < marks.length - (j + 1)) {
                r = marks.length - (j + 1);
            }
            int t = marks[r];
            marks[r] = marks[j];
            marks[j] = t;
            System.out.print(marks[j] + " ");
        }
        System.out.println("}");

        //Task12
        System.out.println("Task 12");
        k = 0;
        for (int i = 0; i < yearsBase.length; i++) {
            for (int j = i; j < yearsBase.length - 1; j++) {
                if (yearsBase[i] == yearsBase[j + 1]) {
                    System.out.println("Coincidences");
                    System.out.println("yearsBase[" + i + "] = " + yearsBase[i]);
                    System.out.println("yearsBase[" + (j + 1) + "]= " + yearsBase[j + 1]);
                    k = 1;
                }
            }
        }
        if (k == 0) {
            System.out.println("There is no coincidence");
        }

        //Task13
        System.out.println("Task 13");
        k = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = i; j < names.length - 1; j++) {
                if (names[i].compareTo(names[j + 1]) == 0) {
                    System.out.println("Coincidences");
                    System.out.println("names[" + i + "]= " + names[i]);
                    System.out.println("names[" + (j + 1) + "] = " + names[j + 1]);
                    k = 1;
                }
            }
        }
        if (k == 0) {
            System.out.println("There are no coincidences");
        }

        //Task14
        System.out.println("task 14");
        String[] namesB = {"Anna", "Tom", "Sunny", "Anton"};
        k = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < namesB.length; j++) {
                if (names[i].equals(namesB[j])) {
                    System.out.println("common elements are");
                    System.out.println("names[" + i + "]= " + names[i]);
                    System.out.println("namesB[" + j + "]= " + namesB[j]);
                    k = 1;
                }
            }
        }
        if (k == 0) {
            System.out.println("There are no coincidences");
        }

        //Task15
        System.out.println("task 15");
        int[] yearBaseB = {
                1234, 1980, 2003,
                2009, 2001, 1987,
                2000, 2001, 2015
        };
        k = 0;
        for (int i = 0; i < yearsBase.length; i++) {
            for (int j = 0; j < yearBaseB.length; j++) {
                if (yearsBase[i] == yearBaseB[j]) {
                    System.out.println("common elements are");
                    System.out.println("names[" + i + "]= " + yearsBase[i]);
                    System.out.println("namesB[" + j + "]= " + yearBaseB[j]);
                    k = 1;

                }
            }
        }
        if (k == 0) {
            System.out.println("There are no coincidences");
        }

        //Task16
        System.out.println("Task 16");
        int[] mass_duplicate = {1, 1, 2, 2, 3, 3, 4, 4};
        int length = mass_duplicate.length;
        int[] mass_a = new int[length];
        int j = 0;
        for (int i = 0; i < mass_duplicate.length - 1; i++) {
            if (mass_duplicate[i] != mass_duplicate[i + 1]) {
                mass_a[j++] = mass_duplicate[i];
            }
        }
        mass_a[j++] = mass_duplicate[length - 1];
        for (int i = 0; i < j; i++) {
            mass_duplicate[i] = mass_a[i];
        }
        for (int i = 0; i < j; i++) {
            System.out.print(mass_duplicate[i] + " ");
        }
        System.out.println();

        //Task17
        System.out.println("Task 17");
        int secondLargest = 0;
        for (int i = 0; i < yearsBase.length; i++) {
            if (intermed < yearsBase[i]) {
                secondLargest = intermed;
                intermed = yearsBase[i];

            }
        }
        System.out.println("Maximum value =" + intermed);
        System.out.println("Second largest element = " + secondLargest);

        //Task18
        //Method 1
        System.out.println("Task 18, method 1");
        Arrays.sort(yearsBase);
        System.out.println("The smallest element is " + yearsBase[0]);
        System.out.println("The second smallest element is " + yearsBase[1]);

        //Method 2
        System.out.println("Taask 18, method 2");
        int first, second;
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < yearBaseB.length; i++) {
            if (yearBaseB[i] < first) {
                second = first;
                first = yearBaseB[i];
            } else if (yearBaseB[i] < second && yearBaseB[i] != first)
                second = yearBaseB[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" + "smallest element");
        else {
            System.out.println("The smallest element is " + first);
            System.out.println("The second smallest element is " + second);
        }

        //Task 19
        System.out.println("Task 19");
        int matrix1[][] = {{1, 2, 3}, {2, 1, 3}, {3, 4, 5}};
        int matrix2[][] = {{2, 3, 1}, {1, 1, 1}, {2, 2, 3}};
        int sumMatrices[][] = new int[3][3];
        for (int i = 0; i < sumMatrices.length; i++)
            for (j = 0; j < sumMatrices[i].length; j++)
                sumMatrices[i][j] = matrix1[i][j] + matrix2[i][j];
        for (int i = 0; i < sumMatrices.length; i++) {
            for (j = 0; j < sumMatrices[i].length; j++)
                System.out.print(sumMatrices[i][j] + "\t");
            System.out.println();
        }
    }
}

