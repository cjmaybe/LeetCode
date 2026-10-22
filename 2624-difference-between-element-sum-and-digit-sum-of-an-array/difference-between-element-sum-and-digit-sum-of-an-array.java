class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            int temp=nums[j];

            while(temp>0){
                digit+=temp%10;
                temp/=10;
            }
        }return sum-digit;
    }
}