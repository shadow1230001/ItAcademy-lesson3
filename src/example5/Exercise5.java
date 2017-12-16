package example5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[][] mass = new int[3][3];

        mass[0][0] = 1;
        mass[0][1] = 100;
        mass[0][2] = 8;

        mass[1][0] = 49;
        mass[1][1] = 12;
        mass[1][2] = 9;

        mass[2][0] = 2;
        mass[2][1] = 5;
        mass[2][2] = 6;

        System.out.println(Arrays.deepToString(mass));

        Scanner in = new Scanner(System.in);
        System.out.println(" What will we search? ");
        int eSearch = in.nextInt();

        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i][j] == 5) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}
