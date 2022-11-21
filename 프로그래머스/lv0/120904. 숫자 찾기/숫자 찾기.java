import java.util.stream.Stream;
import java.util.*;
class Solution {
    public int solution(int num, int k) {
           int answer = 0;
    List<String> list = List.of(String.valueOf(num).split(""));
    List<Integer> index = new ArrayList<>();
    for(int i = 0; i < list.size(); i++){
      if (list.get(i).equals(String.valueOf(k))){
        index.add(i+1);
        answer = index.get(0);
      }
      if ( !list.contains(String.valueOf(k))){
        answer = -1;
      }
    }
    return answer;

  }
}
