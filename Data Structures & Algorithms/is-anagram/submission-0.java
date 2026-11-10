class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String s1 = new String(sChars);
        String s2 = new String(tChars);
        if(s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
