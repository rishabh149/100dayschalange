class Solution {
    public boolean isValid(String s) {
       char [] arr=s.toCharArray();
        if(arr[0]==')' || arr[0]==']' || arr[0]=='}')
            return false;
        
        Stack<Character> stack=new Stack<>();
  
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
                stack.push(arr[i]);
            }
            else if(arr[i]==')' || arr[i]==']' || arr[i]=='}'){
                if(stack.empty())
                    return false;
                if(arr[i]==')' && stack.peek()=='(')
                    stack.pop();
                else if(arr[i]==']' && stack.peek()=='[')
                    stack.pop();
                else if(arr[i]=='}' && stack.peek()=='{')
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false; 
    }
}
