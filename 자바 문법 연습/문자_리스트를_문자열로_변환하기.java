package 자바_문법_공부;

public class 문자_리스트를_문자열로_변환하기 {
	class Solution {
	    public String solution(String[] arr) {
	        String answer = "";
	        for (int i = 0; i<arr.length; i++){
	            answer += arr[i];
	        }
	        return answer;
	    }
	}
}