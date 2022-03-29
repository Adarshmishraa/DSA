package String;

public class oddnoposition {
    public static void main(String[] args) {
        String s="abcd";
        for (int i = 0; i <s.length() ; i+=2) {
            System.out.print(s.charAt(i));
        }
    }
}
