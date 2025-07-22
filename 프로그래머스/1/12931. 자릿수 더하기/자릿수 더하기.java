import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String number = String.valueOf(n);
        
        String[] strings = number.split("");
        
        for (String string : strings) {
            answer = answer + Integer.parseInt(string);
        }
        
        return answer;
    }
}