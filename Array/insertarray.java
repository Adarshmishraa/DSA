package Array;
import java.util.*;
public class insertarray {
        public static void main (String[] args) {
            Scanner S= new Scanner(System.in);
            int a=S.nextInt();
            int k=S.nextInt();
            int[]arr= new int [a];
            for (int i=0; i<a; i++){
                arr[i] = S.nextInt();
            }
            arr=Arrays.copyOf(arr, arr.length+1); //
            arr[arr.length-1]=k;
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

