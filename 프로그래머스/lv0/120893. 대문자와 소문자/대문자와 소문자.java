import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
       String[] a = my_string.split("");
    String[] b = my_string.toUpperCase().split("");
    String[] result = new String[a.length];

    for(int i = 0 ; i < my_string.length(); i++){
      if (Objects.equals(a[i], b[i])){
        result[i] = a[i].toLowerCase();
      }else {
        result[i] = b[i];
      }
    }
    return Arrays.stream(result).collect(Collectors.joining());

  }
}