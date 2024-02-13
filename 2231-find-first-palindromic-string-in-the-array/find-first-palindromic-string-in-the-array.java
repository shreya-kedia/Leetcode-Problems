class Solution {
    public String firstPalindrome(String[] words) {
       for( String word: words){
           String input= new StringBuilder(word).reverse().toString();
           if(word.equals(input))
            return word;
       }
       return "";
    }
    
}