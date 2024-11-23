import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("enter a days for library fine:");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        if(days>0&&days<=5){
            System.out.println("the fine is 50 paisa");
        }
        if(days>5&&days<=10){
            System.out.println("the fine is 1 rupee");
        }
        if(days>10){
            System.out.println("the fine is 5 rupees");
        }
        if(days>30){
            System.out.println("membership is cancelled");
        }
    }
}
