package Array;
import java.util.*;
public class rotatearray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int d = S.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=S.nextInt();
        }
        Arr1(arr,d);
//        for (int i = 0; i < arr.length; i++) // for printing only result {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
    }
        static void Arr1(int arr[], int d) {
            d = d % arr.length;
            if (d==0){
                for (int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            for (int i = 0; i < d; i++) {
                rotateAray(arr);
            }
        }
        public static void rotateAray(int[] arr) {
            int first = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1]; //
            }
            arr[arr.length - 1] = first;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            //System.out.println(Arrays.toString(arr));
        }
    }

