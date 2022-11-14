package Programmers.특정문자제거하기;
/*
문자열 my_string과 문자 letter이 매개변수로 주어집니다.
my_string에서 letter를 제거한 문자열을 return하도록
solution 함수를 완성해주세요.. */

import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    String num = "bread";
    String n = "a";
    String answer = solution(num,n);
    System.out.println(answer);
  }

  public static String solution(String my_string, String letter) {
    return my_string.replace(letter,"");
  }
}
