package Array;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt(); //5
        int[] a = new int[n]; // array
        for (int i = 0; i < a.length; i++) {
            a[i] = S.nextInt(); // array elements getting in
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]+ " ");
        }
    }
}
