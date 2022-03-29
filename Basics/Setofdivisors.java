package Basics;

public class Setofdivisors {
    public static void main(String[] args) {
        System.out.println(divisor(100));
    }
    public static int divisor(int n){
        int count=2;
        int sqrt=(int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n%i==0){
                count++;
                if (n/i!=i){
                    count++;
                }
            }
        } return count;
    }
}
