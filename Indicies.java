import java.util.Scanner;

public class Indicies {
    public static void main(String[] args) {
        int target =10;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int []nums= new int[n];
        System.out.println("enter numbers:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }


    }
}
