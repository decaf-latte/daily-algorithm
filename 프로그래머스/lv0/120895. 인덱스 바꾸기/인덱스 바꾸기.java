import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");
    List<String> list = Arrays.asList(arr);
    String a = list.get(num2);
    String b = list.get(num1);
    list.set(num1,a);
    list.set(num2,b);

    return list.stream().map(n->String.valueOf(n)).collect(Collectors.joining());
  }
}