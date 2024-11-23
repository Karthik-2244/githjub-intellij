import java.util.Scanner;

public class Employ{
    public static void main(String[] args) {
        System.out.println("enter working hours of employe:");
        Scanner sc =new Scanner(System.in);
        int hours = sc.nextInt();
        for(int i=1;i<=10;i++){
            if(hours>40){
                int over_timepay=(hours-40)*12;
                System.out.println("over_timepay of emp no:"+over_timepay);
            }
            else{
                System.out.println("invalid");
                break;
            }
        }
    }
}