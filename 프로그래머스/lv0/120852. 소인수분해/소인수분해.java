import java.util.ArrayList;
import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int primeFactor = 2;
        while(n >  1){
            if(n%primeFactor==0){
                if(!list.contains(primeFactor))
                    list.add(primeFactor);
                n /= primeFactor;
                continue;
            }
            primeFactor++;
        }
        
    return list.stream().mapToInt(i->i).toArray();
    }
}