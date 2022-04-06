import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[n];
        Map<Integer, Set<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            xs[i] = x;
            ys[i] = y;
            if (!hm.containsKey(x))
                hm.put(x, new HashSet<>());
            hm.get(x).add(y);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
                int point1x = xs[i];
                int point1y = ys[i];
                int point2x = xs[j];
                int point2y = ys[j];
                if(point1x == point2x){
                    continue;
                }
                if(point1y == point2y){
                    continue;
                }
                if (hm.get(point1x).contains(point2y) && hm.get(point2x).contains(point1y)) {
                    count += 1;
                }
            }
        }
        System.out.println(count/4);
    }
}
