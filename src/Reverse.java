import java.util.Scanner;

import static java.lang.System.in;

public class Reverse {
    public static void main(String[] args) {
       int n=0;

        System.out.println("enter array size:");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int nums[]=new int[n];
        System.out.println("original array is:");
        System.out.println("enter elements:");
        for (int i = 0; i <n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("reversed array is:");
        for (int j = n- 1; j >= 0; j--) {
            System.out.println(nums[j]);
        }
    }
}