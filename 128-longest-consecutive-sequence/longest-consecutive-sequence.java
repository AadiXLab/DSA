class Solution {
    public int longestConsecutive(int[] nums) {

        int maxcount = 1;
        int currcount = 1;

        Arrays.sort(nums);

        if(nums.length == 0){
            return 0;
        }

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i]){
                continue;
            }
            else if(nums[i+1] == nums[i]+1){
                currcount = currcount + 1;
                maxcount = Math.max(maxcount,currcount);
            }
            else{
                currcount = 1;
            }
        }
        return maxcount;
    }
}