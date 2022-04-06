import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] pref = new int[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (i == 0) {
                pref[i] = a;
            } else {
                pref[i] = a + pref[i - 1];
            }
        }
        long x = in.nextLong();
        long y = x % pref[n - 1];
        long k = 0;
        for (int i = 0; i < n; i++) {
            if (pref[i] > y) {
                k = i + 1;
                break;
            }
        }
        System.out.println(k + x / pref[n - 1] * n);
    }
}
