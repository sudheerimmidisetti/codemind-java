import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int r;
        Scanner read = new Scanner(System.in);
        r = read.nextInt();
        double res = ((4*3.14)*Math.pow(r,3))/3;
        System.out.printf("%.2f",res);
    }
}