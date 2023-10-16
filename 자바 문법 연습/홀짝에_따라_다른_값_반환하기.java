package 자바_문법_공부;

import java.util.StringTokenizer;
import java.io.*;

public class 홀짝에_따라_다른_값_반환하기 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int a = Integer.parseInt(br.readLine());
        if (a%2==0){
            for (int i = 2; i<=a; i += 2){
                answer += i*i;
            }
        }
        else{
            for (int i = 1; i<=a; i+=2){
                answer += i;
            }
        }
        System.out.println(answer);
        
    }
}
