import java.util.*;
class Solution {
    public int solution(int[] array) {
        String str = Arrays.toString(array).replaceAll("[^0-9]","");
    return (int) str.chars().filter(c->c == '7').count();
  }
}