package example1;

public class Exercise1 {
    public static void main(String[] args) {
        int array[] = {327, 381, 891, 918, 212, 848, 770, 363, 416, 736};
        double max = array[0];
        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        System.out.println(" Even element = " + max);

        double after[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            after[i] = array[i]/max;
            System.out.printf("%.2f",after[i]);
            System.out.println("");
        }
    }
}
