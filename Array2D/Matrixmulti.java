package Array2D;

import java.util.*;
public class Matrixmulti {
    public static void main(String[] args) {
   int [][]A  = {{1,2,3},{2,3,4},{1,2,3}};
   int [][]B= {{2,3},{2,3},{1,2}};
   matrixMultiplication(A,B);
    }
    public static void matrixMultiplication(int[][] A, int[][] B) {
        if (A[0].length != B.length) return;
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) // can also write c.length
            {
                int k = 0;
                int res = 0;
                while (k < B.length) {
                    res += A[i][k] * B[k][j];
                    k++;
                }
                C[i][j] = res;
            }
        }
        System.out.println(Arrays.deepToString(C));
    }
}
