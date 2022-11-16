import java.util.*;
class Solution {
    public String solution(String letter) {
            StringBuilder answer = new StringBuilder();
    Map<String,String> mrs = new HashMap<>();
    mrs.put(".-","a");
    mrs.put("-...","b");
    mrs.put("-.-.","c");
    mrs.put("-..","d");
    mrs.put(".","e");
    mrs.put("..-.","f");
    mrs.put("--.","g");
    mrs.put("....","h");
    mrs.put("..","i");
    mrs.put(".---","j");
    mrs.put("-.-","k");
    mrs.put(".-..","l");
    mrs.put("--","m");
    mrs.put("-.","n");
    mrs.put("---","o");
    mrs.put(".--.","p");
    mrs.put("--.-","q");
    mrs.put(".-.","r");
    mrs.put("...","s");
    mrs.put("-","t");
    mrs.put("..-","u");
    mrs.put("...-","v");
    mrs.put(".--","w");
    mrs.put("-..-","x");
    mrs.put("-.--","y");
    mrs.put("--..","z");

    String[] arr = letter.split(" ");

    for (String l : arr){
      answer.append(mrs.get(l));
    }

    return answer.toString();
    }
}