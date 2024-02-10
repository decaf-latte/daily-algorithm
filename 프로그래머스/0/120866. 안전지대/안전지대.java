class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int n = board.length;
        boolean[][] safe = new boolean[n][n];
        
        //일단 모두 안전하다고 가정
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                safe[i][j] = true;
            }
        }
        
        //지뢰 위치 찾아서 상하좌우 대각선 인접을 위험하다고 표시 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1) {
                    for(int di = -1 ; di <=1; di ++){
                        for (int dj = -1; dj <= 1; dj ++){
                            int ni = i + di;
                            int nj = j + dj;
                           if (ni >= 0 && ni < n && nj >= 0 && nj < n) 
                                safe[ni][nj] = false; // 위험 지역 표시
                            }
                        }
                    }
                }
            }
        
    
    // 안전한 지역의 수를 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (safe[i][j]) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
    
}