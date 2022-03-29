package Sorting;

import java.util.Arrays;

public class Stringsort {
    public static void main(String[] args) {
        String[] arr={"ZB","BA","CA","AC","FX"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].charAt(0) - 'A' + " ");
        }
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert (String []arr){
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; j>0 ; j--) {
                if (arr[j-1].charAt(0)-'A'>arr[j].charAt(0)-'A'){
                    String temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else break;
//s.charAT(0)
            }
        }
    }
}
