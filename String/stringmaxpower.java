package String;
public class stringmaxpower {
    public static void main(String args[]){
   System.out.println(max("abbeeeeeeaa"));
    }
    public static int max(String s){
        int count=0;
        int ans=0;
        char last =s.charAt(0);
        for (int i=1; i<s.length(); i++){
            char curr=s.charAt(i);
            if (last==curr){
                count++;
            }
            else {
                last=curr;
                count=1;
            }
            ans=Math.max(ans, count);
        }return ans;
    }
}
