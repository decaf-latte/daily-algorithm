class Solution {
    public String solution(int age) {
   StringBuilder answer = new StringBuilder();
    String a = String.valueOf(age);
    String[] str = a.split("");
    for(int i = 0 ; i < str.length; i ++){
      answer.append((char)(Integer.parseInt(str[i]) + 97));
    }

    return answer.toString();
  }
}