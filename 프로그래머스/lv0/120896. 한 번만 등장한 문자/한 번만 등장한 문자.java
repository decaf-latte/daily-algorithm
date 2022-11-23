import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> list =  Arrays.asList(s.split(""));
    Collections.sort(list);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i< list.size(); i++) {
      int firstIndex = list.indexOf(list.get(i));
      int lastIndex = list.lastIndexOf(list.get(i));

      if(firstIndex == lastIndex) {
        sb.append(list.get(i));
      }

      i = lastIndex;
    }

    return sb.toString();
    }
}