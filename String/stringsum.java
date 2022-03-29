package String;
import java.util.*;
public class stringsum {
    public static void main(String[] args) {
        //String n1="123", n2="12345667";  acc to us n2>n1 always
        Scanner s=new Scanner(System.in);
        String n1=s.next();
        String n2=s.next();
        if (n1.length()>n2.length()){
            String temp=n1;
            n1=n2;
            n2=temp;
        }
         n1= new StringBuilder (n1).reverse().toString();
         n2= new StringBuilder (n2).reverse().toString();
         String res="";
         int carry=0;
         int num1=n1.length(), num2=n2.length();

        for (int i = 0; i < num1; i++) {
            int sum=(int) (n1.charAt(i)-'0') + (int) (n2.charAt(i)-'0') + carry;
            res += (char)(sum%10 + '0'); // by mod we get last digit
            carry=sum/10; // by divide we get 1st digit
        }
        for (int i = num1; i < num2; i++) {
            int sum=(int) (n2.charAt(i)-'0') + carry;
            res += (char)(sum%10 + '0');
            carry=sum/10;
    }

        if (carry>0) {
            res+=(char)(carry+ '0');
        }
        res= new StringBuilder(res).reverse().toString();
        System.out.println(res);
    }
}
