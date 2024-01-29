import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
         if (a.length() > 20 || a.isEmpty()) {
            throw new IllegalArgumentException("글자는 1 ~ 20글자 사이입니다.");
        }
        char[] charArray = a.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}