package Sorting;
import java.util.*;
public class Mergesort {
    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};
        int res[] = mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(res));
    }
    public static int[] merge(int[] n1, int[] n2){
        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int [n1.length+n2.length];
        while (i<n1.length && j<n2.length){
            if (n1[i]<n2[j]) {
                ans[k] = n1[i];
                i++;
                k++;
            }
            else { ans[k] = n2[j];
                j++;
                k++;}
        }
        while (i<n1.length){
            ans[k] = n1[i];
            i++;
            k++;
        }
        while (j<n2.length){
            ans[k] = n2[j];
            j++;
            k++;
        }
        return ans;
    }

    public static int[] mergesort(int []arr, int l, int r) {
        if (l==r){
            int [] res =new int[1];
            res[0]=arr[l];
            return res;
        }
        int mid=(l+r)/2;
        int [] larr= mergesort (arr,l,mid);
        int [] rarr=  mergesort(arr,mid+1,r);
        return merge(larr,rarr);
    }
}


