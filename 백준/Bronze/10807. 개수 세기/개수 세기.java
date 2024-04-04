import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counting = sc.nextInt();
        sc.nextLine();

        String numbers = sc.nextLine();
        int matchNumber = sc.nextInt();

        String[] splitNumber = numbers.split(" ");

        int count = 0;
        for (int i = 0; i < counting; i++) {
            if (Integer.parseInt(splitNumber[i]) == matchNumber) {
                count++;
            }
        }
        System.out.println(count);
    }
}