import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int p, r, t;
        Scanner read = new Scanner(System.in);
        p = read.nextInt();
        r = read.nextInt();
        t = read.nextInt();
        double res = (p*Math.pow((1.0+(r/100.0)),t))-p;
        System.out.printf("%.2f",res);
    }
}