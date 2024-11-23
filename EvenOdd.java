import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int result=0;

        System.out.println("enter a number:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }



        }
    }
}
