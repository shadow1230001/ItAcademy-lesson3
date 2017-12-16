package example4;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 12;
        arr[1][2] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        System.out.println(Arrays.deepToString(arr));

        int max = arr[0][0];
        for (int[] anArr : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (anArr[j] > max) {
                    max = anArr[j];
                }
            }
        }

        System.out.println("Even element: " + max);

    }
}
