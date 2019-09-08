import java.util.Scanner;

public class minutesIntoYearsDays {
    public static void main(String[] args) {



            double minPerYear = 60 * 24 * 365;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the minutes: ");

            double min = input.nextDouble();
            input.close();

            long years = (long) (min / minPerYear);
            int days = (int) (min / 60 / 24) % 365;

            System.out.println( min + " minutes is equals to " + years + " years and " + days + " days");
    }
}
