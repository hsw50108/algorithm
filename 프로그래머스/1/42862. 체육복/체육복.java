import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for (int r : reserve) {
            map.put(r, map.get(r) + 1);
        }

        for (int l : lost) {
            map.put(l, map.get(l) - 1);
        }

        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 0) {
                if (map.getOrDefault(i - 1, 0) == 2) {
                    map.put(i - 1, 1);
                    map.put(i, 1);
                } else if (map.getOrDefault(i + 1, 0) == 2) {
                    map.put(i + 1, 1);
                    map.put(i, 1);
                }
            }
        }

        int answer = 0;
        for (int val : map.values()) {
            if (val >= 1) answer++;
        }

        return answer;
    }
}