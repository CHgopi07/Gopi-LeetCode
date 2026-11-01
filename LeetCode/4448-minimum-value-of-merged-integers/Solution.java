class Solution {
    public int minMergedInteger(int[] nums) {
        int minMerged=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            String   concatenated=String.valueOf(nums[i])+String.valueOf(nums[i+1]);
            int mergedVal=Integer.parseInt(concatenated);
            minMerged=Math.min(minMerged,mergedVal);
        }
        return minMerged;
        
    }
}