package n1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		int count = 0;
		
		if(a.charAt(0) != ' ') {
			count = 1;
		}
		for(int i=0; i<a.length(); i++) {
			if(i<a.length() -1) {
				if(a.charAt(i)==' '&& a.charAt(i+1)!=' ') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
