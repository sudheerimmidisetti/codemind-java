import java.util.*;
public class codemind {
    public static void main(String[] agrs) {
        Scanner read = new Scanner(System.in);
        int min = read.nextInt();
        int h = min/60;
        int m = min%60;
        System.out.printf(h+" Hour(s) "+m+" Minute(s)");
    }
}