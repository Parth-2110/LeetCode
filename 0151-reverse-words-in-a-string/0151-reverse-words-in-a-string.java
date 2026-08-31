class Solution {
    public String reverseWords(String s) {

     StringBuilder x = new StringBuilder();
    String[] str = s.trim().split("\\s+");

     for(int i = str.length - 1; i >= 0; i--){
        x.append(str[i]);
        if( i != 0){
            x.append(" ");
        }

     }

    return x.toString();
    }
}