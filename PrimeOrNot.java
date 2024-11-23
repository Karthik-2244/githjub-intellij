import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
