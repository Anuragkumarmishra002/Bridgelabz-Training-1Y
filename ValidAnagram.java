class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();
        if( n != m ){
            return false ;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals( sChars , tChars );
    }
}