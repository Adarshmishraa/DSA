package Recursion;

public class playrecursion {
    public static void main(String[] args) {
play();
    }

    public static void play() {
        rec(2);

    }
    public static void rec(int n) {
        if (n==0) return; //1
        System.out.println(n); //2
        rec(n-1); //3
        System.out.println(n);


    }
}
