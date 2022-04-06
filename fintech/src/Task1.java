import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int n = in.nextInt();
        int sum = -1;
        int X;
        boolean marker = true;
        if ((A + B) % 2 == 0) {
            X = (A + B) / 2;
        } else {
            marker = false;
        }
        if (((A - B) % 2 == 0) && (A - B >= 0)) {
            sum = (A - B) / 2;
        } else {
            marker = false;
        }
        if (sum < n) {
            marker = false;
        }
        if (marker) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
