package ArrayQuestions;

import java.util.HashMap;

/**
 * Created by STEFY on 15/01/2019.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> val = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (val.containsKey(a)) {
                return new int[]{val.get(a), i};
            }
            val.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
