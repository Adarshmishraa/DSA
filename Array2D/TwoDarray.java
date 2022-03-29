package Array2D;
import java.util.*;

public class TwoDarray {
        public static void main(String[] args) {
            Scanner S=new Scanner(System.in);
            int r=S.nextInt();
            int c=S.nextInt();
            int [][]arr=new int [r][c];
            for (int i=0; i<r; i++){
                for (int j=0; j<c; j++){
                    arr[i][j]=S.nextInt();
                }
            }
            //for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(arr[2][j]+ " ");
            }
            System.out.println();

        }
    }


