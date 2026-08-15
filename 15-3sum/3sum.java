class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for( int curr= 0 ; curr < nums.length; curr++){
            int left = curr+1;
            int right = nums.length -1;
            int target = 0;
            while(left<right){
                int sum = nums[curr] + nums[left] + nums[right];
                if(sum == target){
                    set.add(Arrays.asList(nums[curr], nums[left], nums[right]));
                    left++;
                    right--; // INCREMENTING AND DECREMENTING TOGETHER BECAUSE WE NEED UNIQUE PAIRS
                }
                else if(sum < 0){
                    left++;
                }
                else{      // (sum>0)
                    right--;
                }

            }
        }
        return new ArrayList<>(set);
        
    }
}