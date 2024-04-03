import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] time = s.split(" ");
        String hour = time[0];
        String minute = time[1];

        int convertedHourToInt = Integer.parseInt(hour);
        int convertedMinuteToInt = Integer.parseInt(minute);

        int calculatedHour = convertedHourToInt;
        int calculatedMinute;

        if (Integer.parseInt(minute) < 45) {
            calculatedHour = convertedHourToInt - 1;
            if (calculatedHour < 0) {
                calculatedHour += 24;
            }
            calculatedMinute = (60 + convertedMinuteToInt - 45);
        } else {
            calculatedMinute = convertedMinuteToInt - 45;
        }

        System.out.println(calculatedHour + " " + calculatedMinute);
    }

}