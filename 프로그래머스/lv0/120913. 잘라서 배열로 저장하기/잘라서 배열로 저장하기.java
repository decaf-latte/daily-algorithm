import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

    int start = 0;
    int end = n;

    while (end <= my_str.length()){
      list.add(my_str.substring(start, end));

      start += n;

      if(start > my_str.length() - 1) {
        break;
      }

      if(end + n > my_str.length()){
        end = my_str.length();
      } else {
        end += n;
      }
    }


    return list.toArray(new String[0]);
    }
}