class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        int sum = (a*(a+1))/2;
        int sum2 = 0;
        for(int i = 0 ; i < a ; i++){
            sum2 += nums[i];
        }
        int ans = sum - sum2;
        return ans;
    }
}