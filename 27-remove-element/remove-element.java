class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
//[3,2,2,3] val=3
//count=0 i=0 i<4 3!=3
//count=0 i=1 1<4 2!=3 [2,2,2,3] count=1
//count=1 i=2 2<4 2!=3 [2,2,2,3] count=2
//count=2 i=3 3<4 3!=3 
//count=2 i=4 4<4 X 
//Output=2

//Submission
//100% Run time 