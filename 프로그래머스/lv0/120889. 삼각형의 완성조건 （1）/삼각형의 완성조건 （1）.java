import java.util.*;
class Solution {
    public int solution(int[] sides) {
         int answer = 0;
    int[] a = Arrays.stream(sides).sorted().toArray();
    if (a[2] < a[0]+a[1]){
      answer = 1;
    }else {
      answer = 2;
    }
    return answer;
    }
}