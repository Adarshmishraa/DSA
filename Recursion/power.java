package Recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
    public static int pow(int n,int x){
        if (x==1) return n;
        return n* pow(n,x-1);
    }
}
