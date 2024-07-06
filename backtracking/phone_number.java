// 17. Letter Combinations of a Phone Number (medium)
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] phoneMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(result, phoneMap, digits, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String[] phoneMap, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = Integer.parseInt(digits.charAt(index)+"");
        String letters = phoneMap[digit];

        for (int i = 0; i < letters.length(); i++) {
            backtrack(result, phoneMap, digits, current + letters.charAt(i), index + 1);
        }
    }
}