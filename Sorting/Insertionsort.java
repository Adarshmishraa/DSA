package Sorting;
// sort from left by increasing elements
//time complexity best case o(n) sorted array
// worstcase n^2
import java.util.Arrays;
public class Insertionsort {
    public static void main(String[] args) {
        int arr[]={23,4,3,6,8};
        //4,23,3,6,8
        //4,3,23,6,8
        //3,4,23,6,8
        //3,4,6,23,8
        //3,4,6,8,23
        insertionSort(arr);
        //System.out.println(Arrays.toString(arr));
        }
    public static int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1]>arr[j]) swap(arr,j,j-1);
                else break;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }

}


