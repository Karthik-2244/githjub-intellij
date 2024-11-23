import java.util.Scanner;

public class Gross {
    public static void main(String args[])
    {
        float basic_salary;
        System.out.println("enter Basic salary");
        Scanner sc=new Scanner(System.in);
        basic_salary=sc.nextInt();
       float daallowance= (float) (0.4 *basic_salary);
        float house_allowance= (float) (0.2 * basic_salary);
       float gross_salary = basic_salary+daallowance+house_allowance;
        System.out.println("basic_salary:"+basic_salary);
        System.out.println("daallowance:"+daallowance);
        System.out.println("house_allowance:"+house_allowance);
       System.out.println("gross_salary:"+ gross_salary);


    }
}
