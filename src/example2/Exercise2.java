package example2;

import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        double[] mass = new double[20];
        double[] array = new double[20];

        Random ran = new Random();

        int r;
        System.out.println(" Elements of array: ");
        for (int i = 0; i < mass.length; i++) {
            r = ran.nextInt(100) - 50;
            mass[i] = r;
            System.out.print(mass[i] + " ");

        }
        System.out.println("");
        int j = 0;
        for (int i = 1; i < mass.length; i = i + 2) {
            if (mass[i] > 0) {
                array[j] = mass[i];
                j++;

            }
        }

        double sum = 0;
        System.out.println(" Elements of new array: ");
        for (int k = 0; k < j; k++) {
            System.out.print(array[k] + " ");
            sum = sum + (array[k] * array[k]);
        }
        System.out.println("");
        System.out.println(" Sum of kvadrats:  " + sum);
    }

}

