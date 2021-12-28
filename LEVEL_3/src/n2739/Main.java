package n2739;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gugu = scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(gugu+" * "+i+" = "+(gugu*i));
		}
	}
}
