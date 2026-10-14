class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] countS = new int[26];
        int[] countT = new int[26]; 

        for(int i = 0; i < s.length(); i++){
            int indexS = s.charAt(i) - 'a';
            int indexT = t.charAt(i) - 'a';

            countS[indexS] += 1;
            countT[indexT] += 1;
        }

        for(int i = 0; i < 26; i++){
            if(countS[i] != countT[i]){
                return false;
            }
        }

        return true;
    }
}
