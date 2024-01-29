import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() > 20 || a.isEmpty()) {
            throw new IllegalAccessException("글자는 1 ~ 20자 사이입니다.");
        }
        
        if (b.length() > 20 || b.isEmpty()) {
            throw new IllegalAccessException("글자는 1 ~ 20자 사이입니다.");
        }
        
        System.out.println(a + b);

    }
}