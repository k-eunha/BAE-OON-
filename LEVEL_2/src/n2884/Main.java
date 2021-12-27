package n2884;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min<45) {
			if(hour ==0) {
				hour = 23;
				int min1 = 45 - min;
				min = 60 - min1;
				System.out.print(hour+" "+min);
			}else {
				hour = hour -1;
				int min1 = 45 - min;
				min = 60 - min1;
				System.out.print(hour+" "+min);
			}
		}else {
			min = min -45;
			System.out.print(hour+" "+min);
		}
	}
}
