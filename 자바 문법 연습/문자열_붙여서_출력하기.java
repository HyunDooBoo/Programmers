package 자바_문법_공부;

import java.util.StringTokenizer;
import java.io.*;

public class 문자열_붙여서_출력하기 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        bw.write(a+b);
        bw.flush();
    }
}
