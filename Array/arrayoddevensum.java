package Array;

import java.util.*;
public class arrayoddevensum {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int sum = 0;
        int sum1=0;
        int sumf=0;
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("sum of even no is " + sum);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                sum1 = sum1 + arr[j];
            }
        }
        System.out.println("sum of odd no is " + sum1);
        //sumf
        System.out.println( "2d-Array " + (sum1+sum));

    }
}





