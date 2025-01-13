import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        operation(n);

    }

    public static int operation(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print(j + " ");
                    System.out.println();
                }
                else if(i%2==0){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        return n;
    }

}

