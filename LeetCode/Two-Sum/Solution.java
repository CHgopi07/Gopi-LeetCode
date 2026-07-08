1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int need = target - nums[i];
7
8            if (map.containsKey(need)) {
9                return new int[]{map.get(need), i};
10            }
11
12            map.put(nums[i], i);
13        }
14
15        return new int[]{};
16    }
17}