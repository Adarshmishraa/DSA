package Searching;

public class Linearsearch {
    public static void main(String[] args) {
    int arr[]={12,13,14,15,16,17};
        System.out.println(search(arr,45));
    }
    public static int search (int arr[], int k){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==k) return i;
        } return -1;
    }
}
