

public class Main{
    public static void main(String[] args) {
        int [] nums = {1,2,4,6,9};
        int target = 8;

        int[] result = twosum(nums, target);
        System.out.println("Indices: [" + result[0] + "," + result[1] + "]");
    }

    public static int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }

            }

        }
        return new int[] {-1, -1};

    }
}