import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int nums[][][]=new int[3][2][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++) {
                for (int k = 0; k < 3; k++) {
                    nums[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    System.out.print(nums[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
