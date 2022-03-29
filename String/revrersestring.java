package String;
public class revrersestring {
    public static void main(String[] args) {
        String s="naman";
        String news ="";
        boolean a =true;
        char ch;
        for (int i = s.length()-1; i>=0; i--) {
            news+=s.charAt(i);
        }
        if (s.equals(news)==true) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
