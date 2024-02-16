class Solution {
    public int solution(int[][] dots) {
        // 가능한 모든 직선 쌍에 대해 기울기를 계산
        double slope1 = calculateSlope(dots[0], dots[1]);
        double slope2 = calculateSlope(dots[2], dots[3]);
        double slope3 = calculateSlope(dots[0], dots[2]);
        double slope4 = calculateSlope(dots[1], dots[3]);
        double slope5 = calculateSlope(dots[0], dots[3]);
        double slope6 = calculateSlope(dots[1], dots[2]);
        
        // 평행한 경우를 판별
        if ((slope1 == slope2) || (slope3 == slope4) || (slope5 == slope6)) {
            return 1;
        } else {
            return 0;
        }
    }

    private double calculateSlope(int[] dot1, int[] dot2) {
        // x 좌표의 차이가 0인 경우(수직선), 기울기를 특별한 값으로 처리
        if (dot2[0] - dot1[0] == 0) return Double.MAX_VALUE;
        // 기울기 계산
        return (double)(dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}