import java.util.Scanner;

public class cubeUptoGivenNum {
    public static void main(String[] args) {

        System.out.print("Enter the limit: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.close();

        for(int i=1;i<=n;i++)
        {
            System.out.println("Number is : " +i+"\n"+"Cube of " +i+" is : "+(i*i*i));
        }
    }
}
