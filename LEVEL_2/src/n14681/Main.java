package n14681;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xNum = scan.nextInt();
		int yNum = scan.nextInt();
		
		if(xNum>0) {
			if(yNum>0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(yNum>0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
	}
}
