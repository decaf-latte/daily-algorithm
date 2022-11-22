class Solution {
    public int solution(int[] array, int n) {
        int index = 0;

    for (int i=0; i<array.length-1; i++) {
      if(Math.abs(n-array[index]) > Math.abs(n-array[i+1])) {
        index = i+1;
      } else if (Math.abs(n-array[index]) < Math.abs(n-array[i+1])){
        continue;
      } else {
        if(array[index] > array[i+1]) {
          index = i+1;
        } else {
          continue;
        }
      }
    }
    return array[index];
  }


}