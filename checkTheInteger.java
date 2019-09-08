import java.io.*;
import java.util.Scanner;

public class checkTheInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();

        if (num > 0)
            System.out.println(num + " is POSITIVE");
        else if (num < 0)
            System.out.println(num + " is NEGATIVE");
        else
            System.out.println("You entered a ZERO.");

    }
}
