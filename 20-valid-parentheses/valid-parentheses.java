class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stk = new char[n];

        if(n % 2 != 0){
            return false;
        }

        int top = -1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stk[++top] = c;
            }else{
                if(top == -1){
                    return false;
                }

                char open = stk[top--];

                if((open == '(' && c != ')') ||
                    (open == '{' && c != '}') || 
                    (open == '[' && c != ']')){
                        return false;
                }
            }
        }
        return top == -1;
    }
}