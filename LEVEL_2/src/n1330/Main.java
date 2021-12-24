package n1330;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1<num2) {
			System.out.println("<");
		}else if(num1>num2) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}
