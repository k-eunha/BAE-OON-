package n2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //�׽�Ʈ ���̽� ����
        String[] newS=new String[T];

        //�׽�Ʈ ���̽���ŭ ����
        for(int i=0; i<T; i++){
            int R = sc.nextInt(); // �ݺ� ����
            String S = sc.next(); // ���ڿ� �Է� �ޱ�
            String[] s1=S.split(""); //�ѱ��ھ� �и�
            newS[i]=""; //���� ���� ���ڿ� �ʱ�ȭ

            //�и��� �ѱ��ھ� ���ο� ���ڿ� �迭�� R����ŭ �ݺ��ؼ� �־���
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
