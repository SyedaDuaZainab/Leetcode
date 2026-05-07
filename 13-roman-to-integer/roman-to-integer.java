// class Solution {
//     public int romanToInt(String s) {
//         // Map Roman symbols to their integer values
//         Map<Character, Integer> romanValues = new HashMap<>();
//         romanValues.put('I', 1);
//         romanValues.put('V', 5);
//         romanValues.put('X', 10);
//         romanValues.put('L', 50);
//         romanValues.put('C', 100);
//         romanValues.put('D', 500);
//         romanValues.put('M', 1000);

//         int total = 0;
//         int n = s.length();

//         for (int i = 0; i < n; i++) {
//             int currentVal = romanValues.get(s.charAt(i));
            
//             // Check if there is a next character and if current is smaller than next
//             if (i + 1 < n && currentVal < romanValues.get(s.charAt(i + 1))) {
//                 total -= currentVal; // Subtractive case (e.g., IV)
//              } else {
//                 total += currentVal; // Additive case (e.g., VI)
//             }
//         }
//         return total;
//     }

// }
//Its time complexity and space complexity both are O(n)
//If the mapping is fixed and small, I prefer switch/if-else for efficiency. But if the mapping grows or becomes dynamic, I would use a HashMap for better maintainability

class Solution {
    public int romanToInt(String s) {

        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int cur = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;

            if(cur < next){
                sum -= cur;
            } else {
                sum += cur;
            }
        }

        return sum; 
    }

    private int getValue(char c){

        if(c == 'I') {
            return 1;
        } else if(c == 'V') {
            return 5;
        } else if(c == 'X') {
            return 10;
        } else if(c == 'L') {
            return 50;
        } else if(c == 'C') {
            return 100;
        } else if(c == 'D') {
            return 500;
        } else if(c == 'M') {
            return 1000;
        }

        return 0; 
    }
}
//It's Time Complexity is still O(n) but space complexity reduced to O(1) That's magic