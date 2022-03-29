package Array;

public class arrayoccurence {
    public static void main(String[] args) {
        int []a= {1,1,2,3,3,3,4,1};
        int k=1;
        int count=0;
        for (int i=0; i<a.length; i++){
            if (k==a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
