package n11022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
		}
	}

}
