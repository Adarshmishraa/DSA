package Sorting;
public class Simplesorting {
    public static void main(String[] args) {
                int arr[] = {5,4,3,2,1};
                for (int i = 0; i <arr.length-1; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                     //   if (arr[i]!=arr[j]){
                        int temp = 0;
                        if (arr[i]>arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        //}
                        }
                    }
                }
                for (int i = 0; i <arr.length; i++)
                System.out.print(arr[i] + " ");
            }
        }




