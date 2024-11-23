import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("C:");
        System.out.println("D:");
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int D = sc.nextInt();
        C = C+D;
        D = C-D;
        C = C-D;
        System.out.println("C:"+C);
        System.out.println("D:"+D);
    }
}
