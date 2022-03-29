package Array;

import java.util.*; // contains Collections framework
    public class  arraymax {
        public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
            int n = S.nextInt(); //5
            int[] a = new int[n]; // array
            for (int i = 0; i < a.length; i++) {
                a[i] = S.nextInt(); // array elements getting in
            }
            int max = 0;
            System.out.println(maxid(a, max));
        }

        public static int maxid(int[] a, int max) {
            for (int i = 1; i < a.length; i++) {
                if (a[max]<a[i]) {
                    max = i;
                }
            }
            return a[max];
        }
    }

