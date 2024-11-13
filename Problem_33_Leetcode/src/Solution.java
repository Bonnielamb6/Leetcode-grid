public class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[first] <= nums[mid]) {
                if (nums[first] <= target && target < nums[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else {
                if (target <= nums[last] && nums[mid] < target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

        }
        return -1;
    }
}
