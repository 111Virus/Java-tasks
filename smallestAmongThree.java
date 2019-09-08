import java.util.Scanner;

public class smallestAmongThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scan.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scan.nextInt();
        scan.close();

        if (n1 <= n2 && n1 <= n3)
            System.out.println("\n The Smallest number is: " + n1);

        if (n2 <= n1 && n2 <= n3)
            System.out.println("\n The Smallest number is: " + n2);

        if (n3 <= n1 && n3 <= n2)
            System.out.println("\n The Smallest number is: " + n3);

    }
}
