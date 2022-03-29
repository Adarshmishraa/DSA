package Array2D;

import java.util.*;
public class spiralanticlockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.print(arr[i][0]);
        }
        System.out.println();
        for (int j = 1; j < col; j++) {
            System.out.print(arr[row - 1][j]);
        }
        System.out.println();

            for (int i = row - 2; i >= 0; i--) {
                System.out.print(arr[i][col - 1]);
            }
            System.out.println();


            for (int j = col - 2; j >= 1; j--) {
                System.out.print(arr[0][j]);
            }
            System.out.println();
        }

}