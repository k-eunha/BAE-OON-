package n2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		for(int i=1; i<star+1; i++) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
