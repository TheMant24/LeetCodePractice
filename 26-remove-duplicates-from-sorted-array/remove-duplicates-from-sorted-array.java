class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i+1] > nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[n-1];
        return k+1;
    }
}