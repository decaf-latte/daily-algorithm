
import java.util.*;
class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];
    List<Integer> nums = new ArrayList<>();
    for(int i = 4; i<= n; i ++){
      nums.add(i);
    }
  
    for (int i = 2; i <= n; i++) { 
      arr[i] = i;
    }
    int Sqrt = (int) Math.sqrt(n);
    for (int i = 2; i <= Sqrt; i++) { 
      if (arr[i] == 0) {
        continue;
      }
      for (int j = i + i; j <= n; j += i) {
        arr[j] = 0; 
      }
    }
    for (int j =0 ; j < nums.size(); j ++){
      for (int i = 0; i < arr.length; i ++){
        if(nums.get(j) == arr[i]){
          nums.remove(j);
        }
      }
    }
    return nums.size();
  }
}