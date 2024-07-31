import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int a, b;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        double res = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("%.2f",res);
    }
}