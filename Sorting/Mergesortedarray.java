package Sorting;

import java.util.*;
public class Mergesortedarray {
    public static void main(String[] args) {
        int n1[]={2,3,5,6,8};
        int n2[]={1,4,7,9};
        merge(n1,n2);
        }

    public static void merge(int n1[], int n2[]){
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
            System.out.println(Arrays.toString(ans));
        }
    }



