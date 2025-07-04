import java.util.*;

public class Solution {
  public static int[] solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(arr[0]);
        int recentNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (recentNumber != arr[i]) {
                queue.add(arr[i]);
                recentNumber = arr[i];
            }
        }

        int[] answer = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            answer[index++] = queue.poll();
        }

        return answer;
    }
}