class Solution {
    public int solution(int[][] lines) {
    
        int minStart = 100; 
        int maxEnd = -100;
        for (int[] line : lines) {
            if (line[0] < minStart) minStart = line[0];
            if (line[1] > maxEnd) maxEnd = line[1];
        }

        
        int[] count = new int[maxEnd - minStart + 1]; 
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) { 
                count[i - minStart]++;
            }
        }


        int overlapLength = 0; 
        for (int c : count) {
            if (c >= 2) overlapLength++; 
        }

        return overlapLength;

    }
}