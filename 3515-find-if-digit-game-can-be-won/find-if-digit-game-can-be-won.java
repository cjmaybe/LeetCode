class Solution {
    public boolean canAliceWin(int[] nums) {
        int big=0;
        int single=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                single+=nums[i];
            }
            else{
                big+=nums[i];
            }
        }
        return single!=big;
    }
}