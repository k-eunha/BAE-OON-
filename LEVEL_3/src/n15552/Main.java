package n15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		StringTokenizer st;
		try {
			num = Integer.parseInt(br.readLine());
			for(int i=0; i<num; i++) {
				st = new StringTokenizer(br.readLine());
				bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}