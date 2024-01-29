class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n ;) {
           
             answer ++;
            
             String num = Integer.toString(answer);
            
            if (answer % 3 != 0 && !num.contains("3")) {
                i++;
            }
        
        }
        return answer;
    }
}