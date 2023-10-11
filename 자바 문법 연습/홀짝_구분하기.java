package 자바_문법_공부;

import java.io.*;

public class 홀짝_구분하기 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        if (a%2==0) bw.write(a+" is even");
        else bw.write(a+" is odd");
        bw.flush();
    }
}
