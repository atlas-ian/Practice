package Practice;

public class smallestNumber {
    public static void main(String[] args) {
        int[] nums = {5,7,8,3,56,34,24};
        int [] result = smallest(nums);
        System.out.println(result[0]);
    }

    public static int[] smallest(int[] nums) {
        int min = nums[0];

        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] < min){
                min = nums[i];
            }

        }
        return new int[] {min};
    }
//    return new int[] {-1, -1};
}
