import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        int start = 0;
        while (start!= nums.length) {
            if (values.containsKey(target - nums[start])) {
                return new int[]{values.get(target - nums[start]), start};
            }
            values.put(nums[start], start);
            start++;
        }
        return new int[0];
    }
}