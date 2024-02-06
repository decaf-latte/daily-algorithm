class Solution {
    public int[] solution(int[] numlist, int n) {
        
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = 0; j < numlist.length - i - 1; j++) {
               
                if (Math.abs(numlist[j] - n) > Math.abs(numlist[j + 1] - n) ||
                        (Math.abs(numlist[j] - n) == Math.abs(numlist[j + 1] - n) 
                         && numlist[j] < numlist[j + 1])) {
                    
                    int temp = numlist[j];
                    
                    numlist[j] = numlist[j + 1];
                    
                    numlist[j + 1] = temp;
                }
            }
        }
        return numlist;
    }
}