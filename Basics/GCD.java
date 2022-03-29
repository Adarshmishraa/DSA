package Basics;
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(27,22));
    }
    public static int gcd(int a, int b){
        while(a%b!=0){
            int r=a%b;
            a=b;
            b=r;
        } return b;
    }
}
