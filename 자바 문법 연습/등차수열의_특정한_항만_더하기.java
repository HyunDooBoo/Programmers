class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int tmp = a;
        for(int i=0; i<included.length; i++){
            answer += included[i]? tmp:0;
            tmp += d;
        }
        return answer;
    }
}