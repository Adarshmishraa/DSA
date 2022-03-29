package String;
public class stringcompress {
    public static void main(String[] args) {
        String s="AAACCCBB";
        String res="";
        int i=0;
        char ch=s.charAt(0);
        if (s.length()<1)
            System.out.println(s);
        while (i<s.length()){
            int count =0;
        while (i<s.length() && s.charAt(i)==ch){
            count++; // 3
            i++; // 6
        }
        res+= Character.toString(ch)  + (char) (count +'0');
        if  (i<s.length()) {
            ch = s.charAt(i);
        }
        }System.out.println(res);;
    }
}
