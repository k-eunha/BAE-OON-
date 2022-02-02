package n10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int alpha[]=new int[26];

		for(int i=0;i<26;i++) {
			alpha[i]=-1;
		}
		
		String st = sc.next();

		for(int i=0;i<st.length();i++) {
			if(alpha[st.charAt(i)-97]==-1) {
				alpha[st.charAt(i)-97]=i;
			}
		}

		for(int i=0;i<26;i++) {
			System.out.print(alpha[i]+" ");
		}
	}

}
