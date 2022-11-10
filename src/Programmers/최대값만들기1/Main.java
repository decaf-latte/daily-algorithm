package Programmers.최대값만들기1;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] num = {1,2,30,4,5};
    int answer = solution(num);
    System.out.println(answer);
  }

  public static int solution(int[] numbers) {
    Arrays.sort(numbers);
    int a = numbers.length;

    return numbers[a-2] * numbers [a-1];
  }
}
