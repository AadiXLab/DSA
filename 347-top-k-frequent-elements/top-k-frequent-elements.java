class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Frequency map
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Find maximum k times
        for (int i = 0; i < k; i++) {

            int max = Integer.MIN_VALUE;
            int maxNum = 0;

            // Find maximum frequency
            for (int num : map.keySet()) {

                if (map.get(num) > max) {
                    max = map.get(num);
                    maxNum = num;
                }
            }

            // Store answer
            list.add(maxNum);

            // Remove it so we don't choose it again
            map.remove(maxNum);
        }

        // Convert ArrayList<Integer> → int[]
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}