class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

       while(left<right){
         while(left<right && !isVowel(chars[left])){
            left++;
         }
         while(left<right && !isVowel(chars[right])){
            right--;
         }
         char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
       }
        return new String(chars);
        
    }
     public boolean isVowel(char c){
        char v=Character.toLowerCase(c);
        if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u')
            return true;
        return false;
    }
}