package 자바_문법_공부;

public class 문자열_섞기 {
	class Solution {
	    public String solution(String str1, String str2) {
	        String answer = "";
	        char temp;
	        for (int i = 0; i<str1.length(); i++){
	            temp = str1.charAt(i);
	            answer += temp;
	            temp = str2.charAt(i);
	            answer += temp;
	        }
	        return answer;
	    }
	}
}
