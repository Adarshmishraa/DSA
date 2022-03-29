package Sorting;
// In Selection sort we find minimum index & then compare it with j+1 till array gets sorted.
// Time Complexity Bestcase & Worstcase: n^2
public class Selectionsort {
    public static void main(String[] args) {
        int []arr={5,1,2,3,4,6};
        selectionSort1(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void selectionSort1(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {
            int minIdx = i;
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[minIdx] > arr[j]) minIdx = j;
            }
            if (i != minIdx) swap(arr, i, minIdx);
        }
    }
    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
