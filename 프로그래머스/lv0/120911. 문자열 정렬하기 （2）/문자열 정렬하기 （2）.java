import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.toLowerCase().split("");
    return Arrays.stream(str).sorted().collect(Collectors.joining());
  }
}