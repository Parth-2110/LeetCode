class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder x = new StringBuilder();
        int opened = 0;
      

        for(char ch : s.toCharArray()){

            if(ch == '('  && opened++ > 0) x.append(ch);
            if(ch == ')'  && opened-- > 1) x.append(ch); 
        }
        

        return x.toString();
    }
}