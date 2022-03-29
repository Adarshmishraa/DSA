package Searching;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
public class ternarysearch {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15,16,17};
        int k=14;
        System.out.println(ternarySearch(a,4));
    }
    public static int ternarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int partition = (r - l) / 3;
            int m1 = l + partition;
            int m2 = r - partition;
            if (arr[m1] == k) {
                return m1;
            } else if (arr[m2] == k) {
                return m2;
            } else if (k < arr[m1]) {
                r = m1 - 1;
            } else if (k > arr[m2]) {
                l = m2 + 1;
            } else {
                l = m1 + 1;
                r = m2 - 1;
            }
        }
        return -1;
    }
}

