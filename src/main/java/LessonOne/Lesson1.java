package LessonOne;


public class Lesson1 {
    public static void main(String[] args) {
        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(check(15, 6));
        checkPositiveNegative(-5);
        System.out.println(checkNegative(-3));
        printWordNTimes("Hello", 3);
        System.out.println(checkLeapYear(2000));
        arrTask1(replaceValues);
        System.out.println("\n");
        arrTask2(100);
        System.out.println("\n");
        arrTask3(multiplyOn2);
        System.out.println("\n");
        arrTask4();
        arrTask5(4, 5);
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 10;
        int b = -30;
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }

    }

    public static void printColor() {
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean check(int a2, int b2) {
        int c2 = a2 + b2;
        boolean less = (c2 >= 10);
        boolean more = (c2 <= 20);
        if (less && more) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositiveNegative(int a3) {
        System.out.println((a3 >= 0) ? "Положительное" : "Отрицательное");
    }

    public static boolean checkNegative(int a4) {
        return a4 < 0;
    }

    public static void printWordNTimes(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + str);
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void arrTask1(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }

    public static void arrTask2(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }

    public static void arrTask3(int[] multiplyOn2) {
        for (int i = 0; i < multiplyOn2.length; i++) {
            if (multiplyOn2[i] < 6) {
                multiplyOn2[i] = multiplyOn2[i] * 2;
            }
            System.out.print(multiplyOn2[i] + " ");
        }
    }

    public static void arrTask4() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void arrTask5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}
