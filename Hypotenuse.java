import java.util.*;
public class waterTaps {
    public static void main(String[] agrs) {
        int a, b;
        double c = 0;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("%.2f",c);
    }
}