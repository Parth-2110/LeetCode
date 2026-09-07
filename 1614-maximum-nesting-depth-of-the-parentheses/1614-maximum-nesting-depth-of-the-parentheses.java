class Solution {
    public int maxDepth(String s) {

        int Max = Integer.MIN_VALUE;

      int opened = 0;
    
      for(char c: s.toCharArray()){

            if(c == '(') opened++;
            if(c == ')') opened--;

           Max  = Math.max(opened,Max);
      }

return Max;
    }
}