class Solution {
    public int solution(int n) {
    int answer = (int)Math.sqrt(n);

    if ( Math.pow(answer,2) == n  ){
      answer = 1;
    }else {
      answer = 2;
    }
    return answer;
}
}