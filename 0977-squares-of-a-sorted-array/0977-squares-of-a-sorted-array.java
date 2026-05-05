class Solution {
    public int[] sortedSquares(int[] nums) {
      int i =0;
      for(int j=0;j<nums.length;j++) {
        nums[i]=nums[j]*nums[j];
        i++;
      }
       Arrays.sort(nums);
       return nums;
    }
}