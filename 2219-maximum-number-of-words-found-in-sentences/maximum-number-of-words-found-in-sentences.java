class Solution {
    public int mostWordsFound(String[] sentences) {
                
                int max=0;
                for(int i=0; i< sentences.length;i++){
                int spaceCount=0;
                spaceCount=sentences[i].split(" ").length;
                max= Math.max(max,spaceCount);
                }
                return max;


        
    }
}