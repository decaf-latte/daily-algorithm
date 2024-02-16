class Solution {
    public int solution(String[] babbling) {
        int count = 0; 

        for (String word : babbling) {
           
            if (word.matches("(?!.*aya.*aya)(?!.*ye.*ye)(?!.*woo.*woo)(?!.*ma.*ma)^.*$")) {
                
                String temp = word.replaceAll("aya|ye|woo|ma", "");
                if (temp.isEmpty()) { 
                    count++; 
                }
            }
        }
        
        return count;
    }
}