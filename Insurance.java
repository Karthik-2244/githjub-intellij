import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {

        System.out.println("enter gender(m,f):");
        System.out.println("enter age");
        System.out.println("enter health_condition(exc=1,bcon=0):");
        System.out.println("enter residence(city=1,village=0");
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        int age =sc.nextInt();
        int health= sc.nextInt();
        int residence = sc.nextInt();
        if((health==1)&&(age>=25&&age<=35)&&(residence==1)&&(gender=='m'))
        {
            System.out.println("premium is rs.4 thousand and poilcy amount is 2lakhs");
        }
       else if((health==1)&&(age>=25&&age<=35)&&(residence==1)&&(gender=='f'))
        {
            System.out.println("premium is rs.3 thousand and poilcy amount is 1lakhs");
        }
       else if((health==0)&&(age>=25&&age<=35)&&(residence==0)&&(gender=='m'))
        {
            System.out.println("premium is rs.6 thousand and poilcy amount is 10000");
        }
        else
        {
            System.out.println("no policy");

        }
    }
}
