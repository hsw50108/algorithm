import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int first = a * (b % 10);
        int second = a * ((b / 10) % 10);
        int third = a * ((b / 100) % 10);
        int answer = first +(second * 10) + (third * 100);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(answer);
    }
}
