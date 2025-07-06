import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        
        visited[0][0] = true;

        int[] dx = {0, 0, 1, -1}; 
        int[] dy = {1, -1, 0, 0}; 

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            if (x == n - 1 && y == m - 1) {
                return dist; 
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i]; 
                int ny = y + dy[i]; 

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, dist+1});
                }
            }

        }

        return -1;
    }
}