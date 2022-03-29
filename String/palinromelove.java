package String;

public class palinromelove {
    public static void main(String[] args) {
        int count=0;
        String s="adarsh";
        int looptill= (s.length())/2;
        for (int i = 0; i < looptill; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
