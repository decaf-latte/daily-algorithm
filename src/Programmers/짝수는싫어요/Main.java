package Programmers.짝수는싫어요;

/*
정수 n이 매개변수로 주어질 때,
n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */


import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int num = 15;
    int[] answer = solution(num);
    System.out.println(Arrays.toString(answer));
  }

  public static int[] solution(int n) {
    int[] answer;
    if( n%2 ==0 ){
      answer = new int[n/2];
    }else {
      answer = new int[n/2+1];
    }

    for(int i = 0; i < answer.length; i ++){
      answer[i] = (i*2)+1;
    }
    Arrays.sort(answer);

    return answer;

  }
}
