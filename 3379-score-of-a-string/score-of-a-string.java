class Solution {
    public int scoreOfString(String s) {
        int curr=0;
        int next=0;
        int sum=0;
        for(int i=0;i< s.length()-1;i++){
            curr=(int)s.charAt(i);
            next=(int)s.charAt(i+1);
            sum= sum+ Math.abs(curr-next);
        }
         return sum;
    }
}