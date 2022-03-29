package Basics;

public class ReverseAnumber {
    public static void main(String[] args) {
        System.out.println(reverse(345));
    }
    public static int reverse (int n){
        int res=0;
        while(n>0){
            int last =n%10;
            res=res*10+last;
            n=n/10;
        } return res;
    }
}
