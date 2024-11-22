public class Bubble {
    public static void main(String[] args) {
        int temp = 0;
        int nums[] = {5, 1, 3, 8, 2, 4};
        int size = nums.length;
        System.out.println("before sorting:");
        for (int i=0;i<6;i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp=nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting:");
        for (int i=0;i<6;i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
