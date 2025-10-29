class Solution {
    public int maxSubArray(int[] nums) {
         int currSum=nums[0];
         int maxSum=nums[0];

         for(int i=1;i<nums.length;i++){
            currSum+=nums[i];
             if(currSum<nums[i]){
            currSum=nums[i];
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
           
         }
         return maxSum;
    }
}