package ArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by STEFY on 15/01/2019.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        boolean hasDup = false;
        for (int i = 0; i < nums.length; i++) {
            if (!newSet.add(nums[i])){
                hasDup = true;
            }
        }
        return hasDup;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
