package n2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int count = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i] > max) {
				max = num[i];
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count + 1);
	}

}
