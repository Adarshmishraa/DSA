package Recursion;

public class gcdrecursion {
    public static void main(String[] args) {
        System.out.println(gcd(27,18));
    }
    public static int gcd(int a,int b){
        int r=a%b;
        if (r==0)return b;
        return gcd(b,r);
    }
}
