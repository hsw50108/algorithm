import java.util.ArrayList;
import java.util.List;
class Solution {
     public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
         
        while (true) {
            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
                 answer.add(n);
            } else if (n % 2 != 0) {
                n = (3 * n + 1);
                 answer.add(n);
            }
        }
        return answer;
    }
}