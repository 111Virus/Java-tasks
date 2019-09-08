import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        long sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        long n=sc.nextLong();
        sc.close();
        for( sum=0 ;n!=0 ;n/=10)
        {
             sum+=n%10;
        }
        System.out.println("Sum of digits of a number is "+sum);
    }
}
