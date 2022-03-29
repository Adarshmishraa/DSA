package Sorting;
import java.util.*;
public class practicesort {
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

            }
        }

    }
}
