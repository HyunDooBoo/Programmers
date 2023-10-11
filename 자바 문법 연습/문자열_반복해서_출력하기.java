package 자바_문법_공부;


import java.io.*;
import java.util.StringTokenizer;

public class 문자열_반복해서_출력하기 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i<a; i++){
            bw.write(s);
            bw.flush();
        }
    }
}