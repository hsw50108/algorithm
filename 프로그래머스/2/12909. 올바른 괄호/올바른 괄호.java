import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (charArray[0] == ')') {
                stack.push(c);
                break;
            }

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; 
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}