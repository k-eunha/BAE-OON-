package n8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int array = sc.nextInt();
		String str ;
		
		for (int i=0;i<array;i++) {
			str = sc.next();
			int count=0;
			int sum=0;
			
			for (int j=0; j<str.length();j++) {
				if(str.charAt(j)=='O'){
					count++;
					sum+= count;		
				}else {
					count=0;
				}
			}
			System.out.println(sum);
		}
	}

}
