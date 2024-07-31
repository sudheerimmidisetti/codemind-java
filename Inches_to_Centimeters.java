import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int h;
        Scanner read = new Scanner(System.in);
        h = read.nextInt();
        double res = (2.54*h);
        System.out.printf("%.2f",res);
    }
}