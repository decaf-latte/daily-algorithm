package Programmers.문자반복출력하기;
/*
문자열 my_string과 정수 n이 매개변수로 주어질 때,
my_string에 들어있는 각 문자를 n만큼 반복한 문자열을
 하도록 solution 함수를 완성해보세요. */

public class Main {

  public static void main(String[] args) {
    String num = "bread";
    int n = 3;
    String answer = solution(num, 3);
    System.out.println(answer);
  }

  public static String solution(String my_string, int n) {
    String[] arr = my_string.split("");
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < n; j++) {
        answer.append(arr[i]);
      }
    }
    return answer.toString();
  }


  public static String solution2(String my_string, int n) {
    StringBuilder answer = new StringBuilder();
    String[] str = my_string.split("");
    for (int i = 0; i < my_string.length(); i++) {
      answer.append(str[i].repeat(n));
    }
    return answer.toString();
  }
}
