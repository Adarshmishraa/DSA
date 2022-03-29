package Sorting;
public class Bubblesort {
    // Sorting from right
    //Time complexity Bestcase & Worstcase - n^2 & o(n) flag vala example jisme sirf ek bar chalega (sorted array)
    public static void main(String[] args) {
        int arr[]={11,12,13,14,15};
        bubblesort1(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
            }
    public static void bubblesort1(int []arr){
        for (int i = arr.length-1; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]) swap (arr, j, j+1);
            }
        }
    }
    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
