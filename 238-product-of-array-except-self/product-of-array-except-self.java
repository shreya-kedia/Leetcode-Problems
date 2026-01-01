class Solution {
    public int[] productExceptSelf(int[] nums) {

    int n = nums.length, mult = 1;
    int[] ans = new int[n];
    for(int i = 0; i<n; i++){
        ans[i] = mult;
        System.out.println("ans[i]: " + ans[i] );
        mult*=nums[i];
        System.out.println("mult: " + mult );
    }
    mult = 1;
    for(int j = n-1; j>=0; j--){
        ans[j]*=mult;
        mult*=nums[j];
    }
    return ans;
    }
}