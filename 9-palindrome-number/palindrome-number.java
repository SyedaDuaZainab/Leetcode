// class Solution {
//     public boolean isPalindrome(int x) {
//         String s=String.valueOf(x);
//         boolean isPalindrome=true;
//         for(int i=0;i<s.length()/2;i++){
//             char first=s.charAt(i);
//             char last=s.charAt(s.length()-1-i);
//             if(first!=last){
//                 isPalindrome=false;
//             }
//         }
//         return isPalindrome;
//     }
// }
// In this approach, first int is converted to string then we matches the first character with last 
//It is increasing the Time Complexity O(n) and space complexity too because a for loop is there 
class Solution {
    public boolean isPalindrome(int x) {
        //-ve numbers palindrome ni hoty
        //0 agr last digit h aur first digit zero ni h to its not palindrome
        //Full compare krny ki zaroort bhi ni h
        //Full reverse na kro half reverse krky check kro
        int reversedHalf=0;
        if(x<0){
            return false;
        }
        if(x%10==0 && x!=0){
            return false;
        }
        while(x>reversedHalf){
            int ldigit=x%10;
            x=x/10;
            reversedHalf=reversedHalf*10+ldigit;
        }
       
        return (x == reversedHalf) || (x == reversedHalf / 10);
    }
}