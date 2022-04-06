import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        Arrays.sort(a);
        double x0=0;
        for(int i = n - 1; i >= 0; i--){
            if (i == (n - 1)) {
                x0 = Math.sqrt(a[i]);
            } else {
                x0 = Math.sqrt(x0 + a[i]);
            }
        }
        System.out.println((int)Math.ceil(x0));
    }
}
