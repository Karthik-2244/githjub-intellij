import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int p = 0, n = 0, e = 0, o = 0,z=0;
        int nums[] = new int[25];
        System.out.println("enter numbers:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 25; i++) {

            nums[i] = sc.nextInt();
        }
        for(int i=0;i<25;i++){

            if (nums[i] > 0) {
                p = p + 1;
            }
            if (nums[i] < 0) {
                n = n + 1;
            }
            if (nums[i] % 2 == 0) {
                e = e + 1;
            }
            if (nums[i] % 2 == 1) {
                o = o + 1;

            }
            if(nums[i]==0){
                z=z+1;
            }
           // count++;
        }
        System.out.println("num of positive:" + p);
        System.out.println("num of neg:" + n);
        System.out.println("num of evn:" + e);
        System.out.println("num of odd:" + o);
        System.out.println("num of zero:" + z);
    }
}




