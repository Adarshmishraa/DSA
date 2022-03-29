package String;
public class Palindrome {
    public static void main(String[] args) {
        String s = "krishna";
        boolean a=true;
        int looptill=(s.length()/2);
       // s=s.toUpperCase(); //converting to upper case
        for (int i = 0; i <looptill; i++) {
                if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                     a=false;
                }
            } if (a==false){System.out.println("not palindrome");}
        else System.out.println("palindrome");
        }
        }

