package n2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		for(int i=1; i<=star; i++) {
			for(int j=0; j<star; j++)
				if(j<star-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
			System.out.println();
		}
	}
}