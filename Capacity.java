import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int t, s, b;
        Scanner read = new Scanner(System.in);
        t = read.nextInt();
        s = read.nextInt();
        b = read.nextInt();
        int res = t*s*b;
        System.out.printf(res+" KB");
    }
}