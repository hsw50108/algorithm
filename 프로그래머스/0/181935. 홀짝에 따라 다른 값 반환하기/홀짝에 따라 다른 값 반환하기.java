class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 0;

        if (n % 2 != 0) {
            for (int i = 1; i <= n; i = i + 2) {
                sum += i;
            }
            answer = sum;
        }

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i = i + 2) {
                sum += (i * i);
            }
            answer = sum;
        }
        
        
        return answer;
    }
}