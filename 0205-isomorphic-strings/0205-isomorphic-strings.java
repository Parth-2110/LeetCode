class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> SMap = new HashMap<>();
        HashMap<Character, Character> TMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // Check s -> t mapping
            if (SMap.containsKey(a) && SMap.get(a) != b) {
                return false;
            }

            // Check t -> s mapping
            if (TMap.containsKey(b) && TMap.get(b) != a) {
                return false;
            }

            // Create the mappings
            SMap.put(a, b);
            TMap.put(b, a);
        }

        return true;
    }
}