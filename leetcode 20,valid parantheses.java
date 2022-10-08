class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '(':
                    st.push(ch);
                    flag=1;
                    break;
                case '{':
                    st.push(ch);
                     flag=1;
                    break;
                case '[':
                    st.push(ch);
                     flag=1;
                    break;
                case ')':
                    
                    if(!st.isEmpty()&&st.peek()=='(')
                    st.pop();
                    else
                        return false;
                    break;
                case '}':
                    
                    if(!st.isEmpty()&&st.peek()=='{'){
                        st.pop();
                    }else
                        return false;
                    break;
                case ']':
                    
                    if(!st.isEmpty()&&st.peek()=='['){
                        st.pop();
                    }else
                        return false;
                    break;
            }
            
            
            
            
        }
        
        if(st.isEmpty()&&flag==1){
            return true;
        }
       
        
        return false;
    }
}
