import java.util.*;

class Task3 {

    private int V;

    private static LinkedList<Integer>[] adj;

    Task3(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    Boolean isCyclicUtil(int v,
                         Boolean visited[], int parent) {
        visited[v] = true;
        Integer i;
        Iterator<Integer> it =
                adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            } else if (i != parent)
                return true;
        }
        return false;
    }

    Boolean isCyclic() {
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        for (int u = 0; u < V; u++) {

            if (!visited[u])
                if (isCyclicUtil(u, visited, -1))
                    return true;
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Task3 g1 = new Task3(n);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int ai = in.nextInt();
            int bi = in.nextInt();
            adj[ai-1].add(bi-1);
            adj[bi-1].add(ai-1);
        }
        if (g1.isCyclic())
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}



