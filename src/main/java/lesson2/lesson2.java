package lesson2;

public class lesson2 {

    public static void main(String[] args) {

        replaceArr();
        fillArr();
        multiplyArr();
        squareArr();
        maxMinArr();
        System.out.println(summHalfArr(new int[]{1, 2, 3, 8, 4, 5, 6, 1}));


    }

    // Задание номер 1
    private static void replaceArr() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    private static void fillArr() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n");
    }

    // Задание номер 3
    public static void multiplyArr() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] <= 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.print("\n");
    }

    // Задание номер 4
    public static void squareArr() {
        int[][] squareArr = new int[9][9];

/*        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[i].length; j++) {
                if (i == j) {
                    squareArr[i][j] = 1;
                } else {
                    squareArr[i][j] = 0;
                }
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");*/

        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[i].length; j++) {
                if (i == j || j == squareArr.length - 1 - i) {
                    squareArr[i][j] = 1;
                } else {
                    squareArr[i][j] = 0;
                }
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    // Задание номер 5
    public static void maxMinArr() {
        int[] arr4 = {-23, 122, 36, 1, 22, 1287, 13};
        int minimum = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < minimum) {
                minimum = arr4[i];
            }
        }
        System.out.println(minimum + " - Это минимальное значение");


        int maximum = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > maximum) {
                maximum = arr4[i];
            }
        }
        System.out.println(maximum + " - Это максимальное значение \n");
    }

    // Задание номер 6 (выполнено не в соответствии с заданием, но оно под **)
    public static boolean summHalfArr(int[] arr5) {

        int leftSumm = arr5[0] + arr5[1] + arr5[2] + arr5[3];
        int rightSumm = arr5[4] + arr5[5] + arr5[6] + arr5[7];

        if (leftSumm == rightSumm) {
            return true;
        } else {
            return false;

        }


    }
}

