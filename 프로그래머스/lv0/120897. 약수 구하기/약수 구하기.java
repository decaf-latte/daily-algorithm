import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
         List<Integer> ans = new ArrayList<>();
    for(int i = 1 ; i <= n ; i ++){
      if ( n % i == 0){
        ans.add(i);
      }
    }
    return ans.stream().mapToInt(x->x).toArray();
      }
    }
