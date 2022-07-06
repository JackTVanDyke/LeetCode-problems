package easy;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9 ));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2 ));

    }

    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;

        while (i <= j) {
            int mid = (i+j)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
        return -1;
    }
}
