package n2753;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = scan.nextInt();
		int num1 = year%4;
		int num2 = year%100;
		int num3 = year%400;
		
		if((num1==0&&num2!=0)||num3==0)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
