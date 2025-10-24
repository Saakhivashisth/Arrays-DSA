class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        for(int num:nums){
            if(stack.isEmpty()||stack.peek()!=num){
                stack.push(num);
            }
        }
        int index = 0;
        for (int unique : stack) {
            nums[index++] = unique;
        }
        return stack.size();
        
  
    }
}