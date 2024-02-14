class Solution {
    public boolean isSubsequence(String s, String t) {
        // int j=0;
        // if(s.length()==0) return true;
        // boolean isSub=false;
        // for(int i=0;i<t.length();i++)
        // {
        //     if(t.charAt(i)==s.charAt(j)) 
        //     {
        //         isSub=true;
        //         System.out.println("In loop t[i]: " + t.charAt(i));
        //         System.out.println("In loop s[j]: " +s.charAt(j));
        //         System.out.println("In loop j: "+ j);
        //         j++;
        //     }
        //     else{
        //         isSub=false;
        //     }
        //     if(j!=s.length()){
        //     System.out.println("t[i]: "+ t.charAt(i));
        //     System.out.println("s[j]: "+ s.charAt(j));
        //     System.out.println("j: "+j);
        //     System.out.println("i:"+ i);}
        //     if(j>=s.length()) return isSub;

        // }
        // if(j==s.length()) return true;
        // return isSub;
        int m = s.length();
        int n = t.length();

        int i = 0, j = 0;
        while(i < m && j < n)
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;j++;
            }
            else j++;
        }
        return (i == s.length());
    }
}