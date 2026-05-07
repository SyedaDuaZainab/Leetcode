class Solution {
    public int romanToInt(String s) {
        // Map Roman symbols to their integer values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = romanValues.get(s.charAt(i));
            
            // Check if there is a next character and if current is smaller than next
            if (i + 1 < n && currentVal < romanValues.get(s.charAt(i + 1))) {
                total -= currentVal; // Subtractive case (e.g., IV)
             } else {
                total += currentVal; // Additive case (e.g., VI)
            }
        }
        return total;
    }
}