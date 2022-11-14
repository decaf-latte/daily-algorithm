import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
    int a = numbers.length;
    
    return numbers[a-2] * numbers [a-1];
    }
}