package Array;

public class array3rdmax {
    public static void main(String[] args) {
        int []arr={1,4,2,3,5,7}; // temp
        array(arr);
    }
    public static void array (int []arr){
        int max=arr[0];
        int max1=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max=arr[i];
                }
            }
            System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1 && arr[i]<max) {
                max1=arr[i];
            }
        }
        System.out.println(max1);
        int max2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i]<max1) {
                max2=arr[i];
            }
        }
        System.out.println(max2);

    }

}
