package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (final int num : nums) {
            if (!uniques.add(num)) {
                return true;
            }
        }
        return false;
    }

}
