class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       //Solution without mofiying array : Counting zero approach
       int count = 0;
        int prev = -1; // index of last planted flower

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }

        // handle trailing zeros
        if (prev < 0) {
            count += (flowerbed.length + 1) / 2;
        } else {
            count += (flowerbed.length - prev - 1) / 2;
        }

        return count >= n;
    }
}