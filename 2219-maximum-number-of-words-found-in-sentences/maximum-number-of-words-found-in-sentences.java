class Solution {
    public int mostWordsFound(String[] sentences) {
                //Stack<char> stack2 = new Stack<char>();
                int currCount=0;
                for(int i=0; i< sentences.length;i++){
                int spaceCount=0;
                String sent= sentences[i];
                int j=0;
                while(j< sent.length()){
                    if((sent.charAt(j)+"").equals(" ")){
                       ++spaceCount;
                    }
                    j++;
                    
                }
                if(currCount<spaceCount) currCount=spaceCount;

                System.out.println(spaceCount);
                }
                return currCount+1;


        
    }
}