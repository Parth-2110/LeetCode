class Solution {
    public int maxDepth(String s) {

        int Max = Integer.MIN_VALUE;

      int opened = 0;
    
     for(int i = 0; i < s.length(); i++)
     {

            if(s.charAt(i) == '(') opened++;
            if(s.charAt(i) == ')') opened--;

            Max = Math.max(opened,Max);

     }

return Max;
    }
}