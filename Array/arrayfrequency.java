package Array;

import java.util.*;
public class arrayfrequency {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        int[] count = new int[10];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        for(int i=0; i<size; i++){
            count[arr[i]]++; //
        }
        for(int i=0; i<size; i++) {
            if(count[i]>1)
                System.out.println(i +" is occurs "+ count[i] + " times");
        }

    }
    }

