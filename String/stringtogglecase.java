package String;
public class stringtogglecase {
    public static void main(String[] args) {
        System.out.println(toggle("abc"));
    }
    public static String toggle(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr >= 'a' && curr <= 'z') {
                char newchar = (char) ('A' + curr - 'a');
                ans = ans + newchar;
            } else {
                char newchar = (char) (curr + 'a' - 'A');
                ans = ans + newchar;
            }
        }return ans;
    }
    }

