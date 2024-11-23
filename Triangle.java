import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("enter first side of triangle:");
        System.out.println("enter second side of triangle:");
        System.out.println("enter third side of triangle:");
        Scanner sc = new Scanner(System.in);
        int x = sc .nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if((x<(y+z))&&(y<(x+z))&&(z<(y+x)));
        {
            System.out.println("valid triangle");
        }
    }
}
