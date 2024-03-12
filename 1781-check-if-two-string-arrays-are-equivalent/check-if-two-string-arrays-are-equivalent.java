class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String finalword1= "";
        String finalword2= "";
        for(String word : word1){
            finalword1+=word;
        }
        for(String word : word2){

            finalword2+=word;
        }
        return (finalword1.equals(finalword2));
    }
}