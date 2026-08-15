class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int n= nums.length;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }
        //int rightSum = 0;
        //int currSum=0;
        for(int i =0; i<n; i++){
            if(i == 0){ // ignore 1st elemnet to be added into leftsum
                leftSum = 0;
            }
            else{
                leftSum += nums[i-1];
            }

            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }

        }
        return -1;
        
    }
}