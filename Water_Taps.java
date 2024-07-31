import java.util.*;
public class waterTaps {
    public static void main(String[] agrs) {
        int a, b, c;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = (a*b)/(a+b);
        System.out.println(c);
    }
}