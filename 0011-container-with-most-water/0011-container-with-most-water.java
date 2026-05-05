class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=0;

        while(i<j){
           if(height[i]<=height[j]){
            int l=j-i;
            int b=height[i];
            int area=l*b;
            maxArea=Math.max(area,maxArea);
            i++;
           }
           else {
            int l=j-i;
            int b=height[j];
            int area=l*b;
            maxArea=Math.max(area,maxArea);
            j--;
           }

        }
        return maxArea;
    }
}