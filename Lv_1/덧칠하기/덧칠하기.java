class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int painting = section[0];
        for(int i=1; i<section.length; i++){
            if (section[i] - painting >= m){
                answer += 1;
                painting = section[i];
            }
        }
        return answer;
    }
}