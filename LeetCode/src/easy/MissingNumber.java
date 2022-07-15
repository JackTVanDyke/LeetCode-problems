package easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int numSum = 0;
        int rangeSum = nums.length*(nums.length+1)/2;
        for (int i = 0; i < nums.length; i++) {
            numSum += nums[i];
        }
        return rangeSum - numSum;
    }
}
