import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        arr[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else {
                    if ((j - 1 >= 0 && i - 2 >= 0)) {
                        arr[i][j] += arr[i - 2][j - 1];
                    }
                    if ((j - 2 >= 0 && i - 1 >= 0)) {
                        arr[i][j] += arr[i - 1][j - 2];
                    }
                }
            }
        }
        System.out.println(arr[n - 1][m - 1]);
    }
}
