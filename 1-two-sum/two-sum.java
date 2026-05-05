// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int len=nums.length;
//         for(int i=0;i<len;i++){
//             for(int j=i+1;j<len;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }//if
                
//             }//for
//         }//for
//        return new int[]{-1,-1}; 
//     }
// }
// It's complexity is O(n^2) so to optimize it we sould use hashmap
// It has key-value pair which make the code faster
class Solution{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> sumCheck=new HashMap<>();
        int complement=0;
        for(int i=0;i<nums.length;i++){
            complement=target-nums[i];
            if(sumCheck.containsKey(complement)){
                return new int[]{i,sumCheck.get(complement)};
            }
           
            sumCheck.put(nums[i],i);
        }//for
        return new int[]{-1,-1};
    }
}
//Yahoo the optimization improved to 99.33%