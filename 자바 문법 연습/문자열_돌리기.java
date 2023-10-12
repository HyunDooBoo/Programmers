package 자바_문법_공부;

import java.io.*;

public class 문자열_돌리기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        char tmp;
        for (int i = 0; i<a.length(); i++){
            tmp = a.charAt(i);
            bw.write(tmp+"\n");
        }
        bw.flush();
    }
}