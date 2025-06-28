import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new P1697().solve();
    }
}

class P1697 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int subin = sc.nextInt();
        int brother = sc.nextInt();
        bfs(subin, brother);
    }

    void bfs(int start, int target) {
        boolean[] visited = new boolean[100001];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, 0});

        visited[start] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int position = current[0];
            int time = current[1];

            if (position == target) {
                System.out.println(time);
                return;
            }

            int[] nextPositions = {position - 1, position + 1, position * 2};

            for (int next : nextPositions) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    q.add(new int[]{next, time + 1});
                }
            }
        }
    }
}