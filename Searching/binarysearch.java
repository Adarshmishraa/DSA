package Searching;

public class binarysearch {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        int k=14;
        System.out.println(binary(a,4));
    }
    public static int binary(int a[], int k) {
        int l=0;
        int r=a.length-1;
        while (l<r){
            int mid=(l+r)/2;
            if (a[mid]==k) return mid;
            else if (a[mid]<k) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        } return -1;
    }
}
