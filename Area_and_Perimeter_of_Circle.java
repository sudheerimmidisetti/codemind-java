import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        double area = 3.14*r*r;
        double perimeter = 2*3.14*r;
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f",perimeter);
    }
}