//to find the maximum num in the arry is
import java.util.Scanner;

public class Maximun {
    public static void main(String[] args) {
        int max=0;
        int nums[][]=new int[5][5];
        System.out.println("enter the elements:");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            for(int j=0;j<5;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(nums[i][j]>max){
                    max=nums[i][j];
                }
            }
        }
        System.out.println("the maximun num in the array is:");
        System.out.println(max);
    }
}
