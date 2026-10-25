class Solution {
    public long maximizeSum(int[] nums, int k) {
        int b=nums.length;
        long ts=0;
        int n=nums.length;
        long[]gains=new long[n];
        for(int i=0;i<n;i++){
            ts+=nums[i];
            char[]digits=String.valueOf(nums[i]).toCharArray();
            Arrays.sort(digits);
            long maxVal=0;
            for(int j=digits.length-1;j>=0;j--){
                maxVal=maxVal*10+(digits[j]-'0');
                
            }
            gains[i]=maxVal-nums[i];
        }
        Arrays.sort(gains);
        for(int i=n-1;i>=Math.max(0,n-k);i--){
            if(gains[i]>0){
                ts+=gains[i];
            }
        }
        return ts;
        
    }
}