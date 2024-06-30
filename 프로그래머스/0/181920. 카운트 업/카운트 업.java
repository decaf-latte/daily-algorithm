import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = start_num; i <= end_num; i++) {
            arrList.add(i);
        }
        
        int[] answer = new int[arrList.size()];
        
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}