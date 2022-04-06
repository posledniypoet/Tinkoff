import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long ans = 0;
        if (n == m) {
            ans = 1;
        } else {
            while (n != m) {
                if (n > m) {
                    n -= m;
                    ans += 1;
                } else {
                    m -= n;
                    ans += 1;
                }
            }
            ans += 1;
        }
        System.out.println(ans);
    }
}
