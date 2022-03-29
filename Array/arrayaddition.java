package Array;

import java.util.*;

public class arrayaddition {
        public static void main(String args[]) {
            Scanner S= new Scanner (System.in);
            int a =S.nextInt();
            int sum = 0;
            int []arr= new int [a];
            for (int i=0; i<arr.length; i++){
                arr[i]=S.nextInt();
            }
            for (int i=0; i<arr.length; i++){
                sum= sum + arr[i];
            }

            System.out.println(sum);
        }
    }

