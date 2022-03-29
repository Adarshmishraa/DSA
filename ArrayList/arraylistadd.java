package ArrayList;

import java.util.*;
public class arraylistadd {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int M = S.nextInt(); //adding elements in list
            list.add(M);
        }
            list.add(4, 69);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

