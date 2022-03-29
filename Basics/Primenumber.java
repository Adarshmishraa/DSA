package Basics;

public class Primenumber {
    public static void main(String[] args) {
        System.out.println(  prime(123));
    }
    public static boolean prime(int n){
        int sqrt=(int) Math.sqrt(n);
        for (int i = 2; i <sqrt ; i++) {
            if (n%i==0) {return false;}

        } return true;
    }
}
