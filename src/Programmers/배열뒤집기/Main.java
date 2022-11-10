package Programmers.배열뒤집기;
import java.util.Arrays;
/*
정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 num_list의 원소의 순서를 거꾸로 뒤집은 배열을
 return 하도록 solution 함수를 완성해주세요.
 */

public class Main {
  public static void main(String[] args) {
    int[] num = {1,2,3,4,5};
    int[] answer = solution(num);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int[] num_list) {
   int[] answer = new int[num_list.length];
   for (int i = 0; i < num_list.length; i ++){
     answer[num_list.length - 1 -i] = num_list[i];
   }
    return answer;
  }

}
