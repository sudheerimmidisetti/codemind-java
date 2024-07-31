import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        int x, y, z;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = read.nextInt();
        int res = (z-y)/x;
        System.out.println(res);
    }
}