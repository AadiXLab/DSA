import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // remainder 0 exists before the array starts
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int remainder = sum % k;

            if (map.containsKey(remainder)) {

                // Need at least 2 elements
                if (i - map.get(remainder) >= 2) {
                    return true;
                }

            } else {
                // Store ONLY the first occurrence
                map.put(remainder, i);
            }
        }

        return false;
    }
}