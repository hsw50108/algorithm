import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counting = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= counting; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}