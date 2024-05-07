class Solution {
    public int numberOfSpecialChars(String word) {
                int[] counter = new int[26];
                int[] Bcounter = new int[26];
                for (char c : word.toCharArray())
                {
                    if (c == Character.toUpperCase(c))  Bcounter[c-'A']++;
                    else counter[c-'a']++;

                }
//                 for (var ​i = 0; i<letters.length; i++) {
//     if (letters[i] === letters[i].toUpperCase()
//         && letters[i] !== letters[i].toLowerCase()) {
//         counter[c-'A']++;
//     } else {
//         console.log(letters[i] + ": " + false);
//     }
// }​

                // for(int i=0;i<26;i++) {
                //     System.out.println(counter[i]);

                // }
                // System.out.println();
                // for(int i=0;i<26;i++) {
                //     System.out.println(Bcounter[i]);

                // }
                int count=0;
                for(int i=0;i<26;i++){
                    if(counter[i]>=1 && Bcounter[i]>=1) count++;
                }

                return count;
                     
                


    }
}