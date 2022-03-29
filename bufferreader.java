import java.io.*;
public class bufferreader {
    public static void main(String[] args) throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 1");
        int a=Integer.parseInt(s.readLine());
        System.out.println("enter 2");
        int b=Integer.parseInt(s.readLine());
        int sum = a+b;
        System.out.println(sum);
    }
}
