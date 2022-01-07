package n10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] num = new int[count];
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<count; i++) {
			num[i] = scan.nextInt();
			if(max< num[i])
				max = num[i];
			if(min>num[i])
				min = num[i];
		}
		System.out.println(min + " " + max);
	}

}
