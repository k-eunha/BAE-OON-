package n2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int[] counts = new int[10];
		int number = A * B * C;
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
	}

}