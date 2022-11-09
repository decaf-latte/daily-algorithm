package Programmers.최빈값구하기;

/*
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
최빈값이 여러 개면 -1을 return 합니다.
 */

/*
최빈값 (MODE) : 가장 많이 나타난 값
    -> 데이터의 인덱스의 카운트(count) 값의 최대값(Max)
 */

public class Main {
  public static void main(String[] args) {
    int[] array = {1,2,2,2,3,3,3,4};
    int answer = solution(array);
    System.out.println(answer);
  }

  //런타임 에러 ... 왜?ㅜㅜ
  public static int solution(int[] array) {
    int answer = 0; // 최빈값
    int max = 0;//최대값을 저장하기 위한 변수

    int[] index = new int[array.length+1]; // 배열의 인덱스의 카운트

    for (int j : array) {
      index[j]++;//count
    }


    for(int i=0; i < index.length; i++){
      if(max < index[i]){
        max = index[i];
        answer = i;
      }
    }
    int n = 0; //최빈값의 개수
    for (int j : index) {
      if (j == max) {
        n++;
      }
    }
    if( n > 1 )
      answer = -1;

    return answer;
  }
}

/* 런타임 에러 안나는 정답
public int solution(int[] array) {
        int answer = 0;
        int arr_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > arr_max) {
                arr_max = array[i];
            }
        }

        int[] count = new int[arr_max + 1];
        int max = 0;

        int n = 0;

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                n++;
            }
        }

        if (n > 1)
            answer = -1;

        return answer;
    }
}
 */