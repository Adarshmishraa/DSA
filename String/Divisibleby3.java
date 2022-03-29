package String;
public class Divisibleby3 {
    public static void main(String[] args) {
        String s="12";
        int sum=0;
//        int x=s.charAt(0)-'0';
//        int c=s.charAt(1)-'0';
       // int arr[]=new int[3];
        for (int i = 0; i <s.length(); i++) {
            sum+=s.charAt(i)-'0';
        }
        if (sum%3==0){
            System.out.println("Yes");}
        else {
            System.out.println("no");
        }
    }
}
