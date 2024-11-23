import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for( int spaces=1;spaces<=n-i;spaces++) {
                System.out.print("  ");
            }
                for(int k=1;k<=i;k++){
                    System.out.print(i+"   ");
                }
            System.out.println();
            }

    }
}
