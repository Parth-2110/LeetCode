class Solution {
    public int maxDepth(String s) {

        int opened = 0;
        int max = 0;
        int digit = 0;

        for(char c : s.toCharArray()){

          if(c == '('){
                opened++;
                if(max < opened){
                    max = opened;
                }
            }

            else if(c == ')'){
                opened--;
            }

            

        }
        
        return max;
    }
}