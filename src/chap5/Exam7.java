package chap5;

import java.util.Scanner;

/*
 * ������ ����� �������� ���α׷��� �ۼ��Ͻÿ�.
 * [���]
 * �ﰢ���� ���̸� �Է��ϼ���
 * 5
 * 15 14 13 12 11  ==> i=0 �϶��� 0����
 *    10  9  8  7  ==> i=1 �϶��� 1����
 *        6  5  4  ==> i=2 �϶��� 2����
 *           3  2  ==> i=3 �϶��� 3����
 *              1  ==> i=4 �϶��� 4����
 * 
 * */
public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���.");
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i ++) {
			sum += i;
	}
		for (int i = 0; i <num; i++) { // ���� �����ؼ� �˰����� ã�Ƴ����Ѵ�.
			for (int j = 0; j < num ; j++) {

				if (j<i)
					System.out.printf("%3c",' ');
				else
					System.out.printf("%3d", sum--); // 4d ==> 4�ڸ��� Ȯ���ؼ� ���.
			}
			System.out.println();
		}
	}
}
