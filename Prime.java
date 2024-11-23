import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
        int i,num, count=0;
        System.out.println("enter number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(i=2;i<num;i++)
        {
            if(num % i== 0)
            {
                count++;
            }
            if (count == 0)
            {
                System.out.println(num + " is prime number");
                break;
            }
            else
            {
                System.out.println(num + " not prime number");
                break;
            }
        }
    }
}