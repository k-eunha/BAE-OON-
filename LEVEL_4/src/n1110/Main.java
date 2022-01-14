package n1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = N;
        int i = 0;
        while (true){
        	N = (N % 10 * 10) + ((N / 10 + N % 10)%10);
        	i++;
        	if(N==M){
        		break;
        	}
        }
        System.out.println(i);
	}

}
