class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 has occurred once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            int complement = sum - k;

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}