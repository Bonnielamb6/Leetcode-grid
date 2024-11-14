import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);
        int currentMult = 1;

        for (int i = 1; i < nums.length; i++) {
            currentMult *= nums[i - 1];
            prefix[i] = currentMult;
        }
        currentMult = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            currentMult *= nums[i + 1];
            suffix[i] = currentMult;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}
