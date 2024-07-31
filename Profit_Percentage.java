import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int x, y;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        double res = ((y-x)*100.0)/x;
        System.out.printf("%.2f",res);
    }
}