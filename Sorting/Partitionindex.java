package Sorting;
import java.util.Arrays;

public class Partitionindex {
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,9,1};
        partition(arr);
        System.out.print(Arrays.toString(arr));
        }

    public static int partition(int[]arr) {
        int pivot = arr[arr.length - 1];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] <= pivot) {
                if (i != j) {
                    swap(arr, i, j);
                }
                j++;
            } else i++;
        }
        return j - 1;
    }
        public static void swap(int[] arr, int i, int minIdx) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
}
