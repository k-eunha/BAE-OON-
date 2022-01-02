package n10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int max = scan.nextInt();
		int[] nums = new int[num];
		for(int i=0; i<num; i++) {
			nums[i] = scan.nextInt();
		}
		for(int i=0; i<num; i++) {
			if(nums[i]<max)
				System.out.print(nums[i]+" ");
		}
	}
}