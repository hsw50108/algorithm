import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean answer = false;

        boolean check4Multiples = (year % 4 == 0);
        boolean checkNot100Multiples = (year % 100 != 0);
        boolean check400Multiples = (year % 400 == 0);

        if ((check4Multiples && checkNot100Multiples) || (check4Multiples && check400Multiples)) {
            answer = true;
        }

        if (answer) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}