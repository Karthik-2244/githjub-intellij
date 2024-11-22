import java.util.Scanner;

public class Maximun {
    public static void main(String[] args) {
        int max=0;
        int nums[][]=new int[5][5];
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
                System.out.println(max);
            }

        }
    }
}
