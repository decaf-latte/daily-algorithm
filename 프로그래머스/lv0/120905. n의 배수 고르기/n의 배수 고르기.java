import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
    for (int i = 0 ; i < numlist.length; i ++){
      if (numlist[i] % n == 0){
        answer[i] = numlist[i];
      }else{
        answer[i] = 0;
      }
    }
    return Arrays.stream(answer).filter(e->e!=0).toArray();
  }
}