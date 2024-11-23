import java.util.Scanner;

public class For{


    public static void main(String args[])
    {
        int n,spaces;
        System.out.println("enter a number :");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(spaces=1;spaces<=n-i;spaces++)
            {
                System.out.print (" ");
           }
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}