class Solution {
    public int solution(String my_string) {
        int answer = 0;
    String[] str = my_string.split("");
    String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int[] num = new int[str.length];

    for (int i = 0; i < str.length; i++) {
      for(int j =0 ; j < nums.length; j++){
        if (str[i].equals(nums[j])) {
          num[i] = Integer.parseInt(nums[j]);
        }
      }
    }for (int i = 0; i < str.length; i++){
      answer += num[i];
    }

    return answer;
  }
}