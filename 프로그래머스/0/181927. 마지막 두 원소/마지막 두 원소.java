import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int num : num_list) {
            answerList.add(num);
        }

        int last = answerList.get(answerList.size() - 1);
        int before = answerList.get(answerList.size() - 2);
        
        if (last > before) {
            answerList.add(last - before);
        } else {
            answerList.add(last * 2);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}