class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int countP = 0;
        int countY = 0;

        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'P') {
                countP++;
            }
            if (currentChar == 'Y') {
                countY++;
            }
        }
        
        if (countP != countY) {
            answer = false;
        }

        return answer;
    }
}
