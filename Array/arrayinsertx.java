package Array;

import java.util.*;
public class arrayinsertx {
        public static void main (String []args){
            int n=7;
            int arr[]={23,34,12,21,51,64};
            int pos=5;
            int x=50;
            insertx (arr,n,x,pos);
        }
        public static void insertx(int arr[], int n, int x, int pos){
            int newarr[] = new int[n];
            for (int i=0; i<n; i++){
                if (i<pos){
                    newarr[i]=arr[i];
                }
               else if (i==pos){
                    newarr[i]=x;
                }
                else {
                    newarr[i]=arr[i-1];
                }
            } System.out.println(Arrays.toString(newarr));
        }

    }

