class Solution {
    public int solution(int[][] dots) {
        
        int a1 = dots[0][0];
        int a2 = dots[0][1];
        
        int b1 = dots[1][0];
        int b2 = dots[1][1];
        
        int c1 = dots[2][0];
        int c2 = dots[2][1];
        
        int d1 = dots[3][0];
        int d2 = dots[3][1];
        
        //가로 
        int garo = b1 - a1 ;
        
        if (garo == 0) {
            garo = c1-a1 ; 
        
        }
        
        if ( garo < 0 ){
            garo *= -1 ;
        } 
        
        //세로 
        int sero = c2-b2;
        if (sero == 0) {
            sero = d2-c2 ; 
        
        }
        if ( sero < 0){
            sero *= -1;
        }
        
        
        return garo * sero;
    }
}