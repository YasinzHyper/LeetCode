// 3. Longest Substring Without Repeating Characters (medium)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;
        int temp = 0;
        String sub = new String();
        for (int i=0; i<n; i++) {
            sub = "";
            temp = 0;
            for (int j=i; j<n; j++) {
                if (sub.indexOf(s.charAt(j))>=0) {
                    break;
                }
                temp++;
                sub += s.charAt(j);
            }
            if (temp >= count)
                count = temp;
        }
        return count;
    }
}