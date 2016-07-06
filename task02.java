import java.util.Arrays;

public class BetterProgrammerTask {

    public static int[] removeDuplicates(int[] a) {
        /*
          Please implement this method to
          remove all duplicates from the original array. Retain the order of the elements and
          always retain the first occurrence of the duplicate elements.
          For example, parameter: {2,1,2,3}, result: {2,1,3}
         */

        int[] b = new int[a.length];

        int shift = 0;

        boolean isNot;

        for (int i = 0; i < a.length; i++) {

            isNot = true;

            for (int j = 0; j < i; j++) {
                if (a[i] == b[j]) isNot = false;
            }

            if (isNot) {
                b[shift] = a[i];
                shift++;
            }

        }

        if (a.length == shift) return a;

        int[] c = new int[shift];

        for (int i = 0; i < shift; i++) {
            c[i] = b[i];
        }

        return c;




    }
    public static void main(String args[]) {
        System.out.println("test");

        //int[] a = {2, 1, 4 ,3, 2, 3, 7, 8, 8, 0};
        int[] a = {};
        int[] b = removeDuplicates(a);
        System.out.println(Arrays.toString(b));
    }
}
