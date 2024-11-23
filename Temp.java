import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        System.out.println("enter Fahrenheit temparature:");
        Scanner sc = new Scanner(System.in);
        int fahrenheit= sc.nextInt();
        int centigrade = (fahrenheit-32)*5/9;
        System.out.println("fahrenheit:"+fahrenheit);
        System.out.println("centigrade:"+centigrade);
    }
}
