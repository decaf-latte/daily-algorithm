import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

    int[] arr =new int[j-i+1];
    for (int x = 0; x < arr.length; x ++){
      arr [x] = i++;
    }
    String[] list = Arrays.stream(arr).mapToObj(n->String.valueOf(n)).collect(Collectors.joining()).split("");
    for (String s : list) {
      if (Objects.equals(s, String.valueOf(k))) {
        answer++;
      }
    }
    return answer;
  }
}