class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        boolean isPalindrome=true;
        for(int i=0;i<s.length()/2;i++){
            char first=s.charAt(i);
            char last=s.charAt(s.length()-1-i);
            if(first!=last){
                isPalindrome=false;
            }
        }
        return isPalindrome;
    }
}