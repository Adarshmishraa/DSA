package Recursion;
import java.util.*;
public class ternaryrecursion {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int k=S.nextInt();
        int[] arr= new int [a];
        for (int i=0; i<a; i++){
            arr[i]=S.nextInt();
        }
        System.out.println(ternary(arr, k, 0 , (arr.length-1)));
    }
    public static int ternary(int []arr, int k, int l , int r){
        if (l>r) return-1;
        int Partition  =(r-l)/3;
        int m1 =l+Partition;
        int m2= r-Partition;
        if (arr[m1]==k) return m1;
        else if (arr[m2]==k) return m2;
        else if (k<arr[m1]) return ternary(arr, k, l, m1-1);
        else if (k>arr[m2]) return ternary(arr, k, m2+1,r);
        else return ternary(arr, k,m1+1 ,m2-1);
    }
}
