package com.company;

import javax.security.auth.Subject;
import java.io.*; // for handling input/output
import java.sql.SQLOutput;
import java.util.*; // contains Collections framework

public class Main {
    public static void main(String args[]) {
//        Scanner s= new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int c = s.nextInt();
//        String z= s.next();
////System.out.println(add(a,b));
////System.out.println(sub(a,b));
////table(c);
//        switch(z)
//        {
//       case"+":{
//            System.out.println(add(a,b));
//            break;}
//       case"-":{
//            System.out.println(sub(a,b));
//            break;}
//          case "table":{
//              table(c);
//              break;}
//          default:
//          {
//              System.out.println("bc");
//          }
//        }
//    }
//    public static int add (int a, int b)
//    {
//        return a+b;
//    }
//    public static int sub (int a, int b)
//    {
//      return a-b;
//    }
//    public static void table (int c) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println( c + "*" + i + "=" + c*i);
//        }
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter no");
//        int n= s.nextInt();
//        System.out.println("enter size of array:");
//        int size = s.nextInt();
//        int[] a = new int[size];
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("enter " + i + "value:");
//            a[i] = s.nextInt();
//        }
//        System.out.println("enter the value of k:");
//        int k = s.nextInt();
//        System.out.println(max(a));
//        System.out.println(findk(a,k));
//        System.out.println(reverseNumber(n));
      int [] A =new int [] {1,2,3};
      int [] B =new int [] {4,5,6};
      for (int i=0; i<A.length;i++){
          System.out.print(A[i]);
      }
        System.out.println();
        for (int i=0; i<B.length;i++){
            System.out.print(B[i]);
        }
        System.out.println();
        int carry=0;
        int sum=0;
        int n=A.length-1;
        for (int i=n; i<=n; i--){
            sum=sum + A[i]+B[i];
            System.out.println(sum);
        }
        }

//    public static int reverseNumber (int n)
//    {
//        int result=0;
//        while (n>0){
//            int last = n%10;
//            result = result * 10+ last;
//            n= n/10;
//        }
//        return result;

    }
//
//    public static int findk(int[] a,int el) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == el) {
//                return i;
//            }
//        }
//        return -1;

//    }

//    public static int max (int[] a) {
//        int max= 0;
//        for (int i = 0; i < a.length; i++){
//            if (max<a[i]) {
//                max = a[i];
//            }
//    }
//        return max;
//    }
//        int max= 0;
//        for (int i = 0; i < a.length; i++){
//        if (max<a[i]){
//        max=a[i];
//        }
//        }
//        System.out.println("max value"+max);
////        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");




