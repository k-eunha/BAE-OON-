package n2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //테스트 케이스 개수
        String[] newS=new String[T];

        //테스트 케이스만큼 돌기
        for(int i=0; i<T; i++){
            int R = sc.nextInt(); // 반복 개수
            String S = sc.next(); // 문자열 입력 받기
            String[] s1=S.split(""); //한글자씩 분리
            newS[i]=""; //새로 만들 문자열 초기화

            //분리한 한글자씩 새로운 문자열 배열에 R번만큼 반복해서 넣어줌
            for(int x=0; x<S.length(); x++){
                for(int y=0; y<R; y++){
                    newS[i]+=s1[x];
                }
            }
        }

        for (String s:newS) {
        	System.out.println(s);
        }
        return;
	}
}
