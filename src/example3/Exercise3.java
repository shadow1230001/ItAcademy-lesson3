package example3;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {4, 5, 6}};
        int[] temp;
        temp = Arrays.copyOf(array[0], array[0].length);
        array[0] = Arrays.copyOf(array[1], array[1].length);
        array[1] = Arrays.copyOf(temp, temp.length);
        System.out.println(Arrays.deepToString(array));

    }
}
