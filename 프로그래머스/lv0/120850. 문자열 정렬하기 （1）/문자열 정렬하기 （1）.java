import java.util.*;
class Solution {
    public int[] solution(String my_string) {
         String[] arr = my_string.replaceAll("[A-Z|a-z]","").split("");
    Arrays.sort(arr);

    return Arrays.stream(arr).mapToInt(e->Integer.parseInt(e)).toArray();

  }
}