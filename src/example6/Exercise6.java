package example6;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[][] mass = new int[3][3];

        mass[0][0] = 10;
        mass[0][1] = 12;
        mass[0][2] = 13;

        mass[1][0] = 51;
        mass[1][1] = 12;
        mass[1][2] = 49;

        mass[2][0] = 22;
        mass[2][1] = 28;
        mass[2][2] = 29;

        System.out.println(Arrays.deepToString(mass));

        int elements;
        int value = 0;
        double bElement;
        double sum;
        for (int[] mas : mass) {
            for (int j = 0; j < mass.length; j++) {
                if ((mas[j]) > 9 && mas[j] < 100) {
                    elements = mas[j] % 10;
                    bElement = mas[j] / 10;
                    sum = elements + bElement;
                    if (sum % 2 == 0) {
                        value = value + 1;
                    }
                }
            }
        }
        System.out.println(value);
    }
}
