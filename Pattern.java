import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //operation(n);
        //operation1(n);
        operation2(n);
    }
    public static int operation(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return n;
    }
    public static int operation1(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+"");
            }
        }
        return n;
    }
    public static int operation2(int n){

        for(int i = 2; i <= n; i++){
            int count=0;
            for(int j = 1; j <=n; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }

        }
        return n;
    }
}