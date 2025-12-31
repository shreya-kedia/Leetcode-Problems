class Solution {
    public String reverseVowels(String s) {
       Set<Character> vowels = Set.of(
            'a','e','i','o','u','A','E','I','O','U'
        );

        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;

        while (l < r) {
            while (l < r && !vowels.contains(chars[l])) l++;
            while (l < r && !vowels.contains(chars[r])) r--;

            char temp = chars[l];
            chars[l++] = chars[r];
            chars[r--] = temp;
        }
        return new String(chars);

    }


}