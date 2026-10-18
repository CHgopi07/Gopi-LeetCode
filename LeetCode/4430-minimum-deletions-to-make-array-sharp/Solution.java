class Solution {
    public int minDeletions(int[] nums) {
        int n=nums.length;
        int deletions=0;
        int lastkept=nums[0];
        for(int i=1;i<n;i++){
            if((lastkept^nums[i])==0){
                deletions++;
            }else{
                lastkept=nums[i];
            }
            }
        return deletions;
        }
        
    }
