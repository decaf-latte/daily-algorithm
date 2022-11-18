class Solution {
    public int solution(int n) {
     int answer = 0;
    for (int i = 1; i <= 10 ; i ++){
      if (facto(i) <= n){
        answer = i;
      }else {
        break;
      }
    }
    return answer;
  }
  public static int facto (int i){
    if (i <= 1) {
      return 1;
    }
    return facto(i-1) * i;
  }
}