import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        int count=0;
        int result=0;
        int nums[]= new int[25];
        System.out.print("enter the numbers:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<25;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the search element:");
        int a = sc.nextInt();
        for(int i=0;i<25;i++){
            if(a==nums[i]){
                count++;
                 result=result+1;
            }
            if(count>0){
                System.out.println("number is there");

                System.out.println("repeated time of number"+result);
            }
        }

    }
}