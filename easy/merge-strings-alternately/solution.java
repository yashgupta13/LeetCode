class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1==null && word2==null){return null;}
        if(word1==null){return word2;}
        if(word2==null){return word1;}
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}