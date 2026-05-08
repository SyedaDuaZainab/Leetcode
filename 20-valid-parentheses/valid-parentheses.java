// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='(' || ch=='{' || ch=='['){
//                 stack.push(ch);
//             }else{
//                 if(stack.isEmpty()) return false;
//                 char top=stack.pop();
//                 if(ch==')' && top!='(') return false;
//                 if(ch=='}' && top!='{') return false;
//                 if(ch==']' && top!='[') return false;
//             } 
           
//         }
//         return stack.isEmpty();
//     }
// }
//Its run time is 3ms and memory usage is 72.03% which is already good

class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // opening brackets
            if(ch == '(' || ch == '{' || ch == '['){
                stack[++top] = ch;
            } 
            else {
                if(top == -1) return false;

                char prev = stack[top--];

                if(ch == ')' && prev != '(') return false;
                if(ch == '}' && prev != '{') return false;
                if(ch == ']' && prev != '[') return false;
            }
        }

        return top == -1;
    }
}
//Here we are using array as stack so it's more optimized and clean now
//Run time and memory usage is optimized and this is fastest and best approach