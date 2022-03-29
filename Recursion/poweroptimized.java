package Recursion;

public class poweroptimized {
    public static void main(String[] args) {
        System.out.println(pow0(2,5));
    }
    public static int pow0 (int n, int x){
        if (x==1) return n;
        int res=pow0(n,x/2);
        res=res*res;
        if (x%2==1){
            res=res*n;
        }
        return res;
    }
}
