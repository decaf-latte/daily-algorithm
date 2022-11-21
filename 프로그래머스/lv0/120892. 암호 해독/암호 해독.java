import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String cipher, int code) {
        List<String> list = Arrays.asList(cipher.split(""));
    List<String> result = new ArrayList<>();
    
    for (int i = 1 ; i <= list.size()/code; i++){
      result.add(list.get(i*code-1));
    }

    return result.stream().map(String::valueOf).collect(Collectors.joining());
  }
}