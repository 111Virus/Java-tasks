import java.util.Scanner;

public class circleAreaPerimeter {
    public static void main(String[] args) {
        System.out.println("Enter the value of the radius");

        Scanner obj = new Scanner(System.in);
         float radius = obj.nextFloat();

        obj.close();

        System.out.println("Area of the circle of radius "+radius+" is = "+3.142*radius*radius );
        System.out.println("Perimeter of the circle of radius "+radius+" is = "+3.142*radius*2 );
    }
}
