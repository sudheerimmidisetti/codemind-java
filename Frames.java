import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int n, m, x;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        m = read.nextInt();
        x = read.nextInt();
        int res = (2*(n+m))*x;
        System.out.println(res);
    }
}