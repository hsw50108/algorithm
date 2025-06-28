import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new P10451().solve();
    }
}

class P10451 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int t = 0; t < testCase; t++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean[] visited = new boolean[n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    dfs(arr, visited, i);
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    void dfs(int[] arr, boolean[] visited, int current) {
        if (visited[current]) return;
        visited[current] = true;
        dfs(arr, visited, arr[current] - 1);
    }


}
