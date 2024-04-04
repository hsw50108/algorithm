import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int total = N / 4;

        String answer = "";
        for (int i = 1; i <= total; i++) {
            answer += "long ";
        }
        answer += "int";
        System.out.println(answer);
    }
}