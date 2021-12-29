package n8393;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scan.nextInt();
		int s =0;
		for(int i=0; i<num+1;) {
			s = s+i;
			i++;
		}
		System.out.println(s);
	}

}
