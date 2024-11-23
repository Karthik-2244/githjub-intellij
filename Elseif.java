import java.util.Scanner;
public class Elseif{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    int day=sc.nextInt();
    if(day==0) {
        System.out.println("sunday");
    }
    else if(day==1) {
        System.out.println("monday");
    }
    else if(day==2) {
        System.out.println("tuesday");
    }
    else{
        System.out.println("invalid option");
    }
}
}