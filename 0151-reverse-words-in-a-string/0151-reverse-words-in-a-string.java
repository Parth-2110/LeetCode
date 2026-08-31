class Solution {
    public String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        String revWord = "";

        for(int i = str.length - 1; i >= 0; i--){
           revWord += str[i]+ " ";
        }

        return revWord.trim();
    }
}