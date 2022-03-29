package Searching;

import java.util.Scanner;

public class searchingsmallerelements {
    public static void main(String[] args) {

        int []arr={1,4,7,8,9,10};
        int n=6;
        int k=9;
        System.out.println(isPresent(arr,n,k));
    }

    static int isPresent(int arr[], int n, int k)
    {
        int count=0;
        for (int i=0; i<n; i++){
            if (arr[i]<=k){
                count++;
            }
            else break;
        }
        return count;

    }
}
