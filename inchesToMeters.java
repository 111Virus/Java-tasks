import java.util.Scanner;

public class inchesToMeters {
    public static void main(String[] args) {

        System.out.println("Enter the value(in inches) to convert into meters");
        Scanner obj = new Scanner(System.in);
        double inch = obj.nextDouble();
        obj.close();

        System.out.println(inch+" in meters = "+inch*0.0254);
    }
}
