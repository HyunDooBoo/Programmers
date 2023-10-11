package 자바_문법_공부;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        String answer = "";
        char tmp;
        
        for (int i = 0; i<a.length(); i++){
            
            tmp = a.charAt(i);
            
            if ((tmp>=65)&&(tmp<=90)){
                answer += String.valueOf(tmp).toLowerCase();
            }
            
            else answer += String.valueOf(tmp).toUpperCase();
        }
        bw.write(answer);
        bw.flush();
    }
}