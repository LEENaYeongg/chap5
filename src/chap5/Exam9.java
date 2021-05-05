package chap5;

import java.util.Scanner;

/* [���] �ﰢ���� ���̸� �Է��ϼ���
		3
		
		   9
	    8  7  6
	 5	4  3  2  1
	 
	 ==> �� ����� ���ں��� ��� ����ؾ��ϴ��� ��Ģ�� ã�Ƴ�����.
	 
*/
public class Exam9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���.");
		int len = scan.nextInt();
		// ���� �Ʒ��� ĭ��.
		int bottom = len * 2 - 1;
		int sum = 0;

		/*
		 * ���1) for(int i =1; i<=len; i++){ 
		 * sum += i*2-1; ==> �ٴ��� ����
		 * }
		 */

		// ���2)
		for (int i = bottom; i >= 1; i -= 2) {
			sum += i;
		}
		int half = bottom / 2;
		int data = sum;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < bottom; j++) {
				if (j >= (half - i) && j <= (half + i))
					System.out.printf("%3d", data--);
				else
					System.out.print("   "); // ���� ������ ����
			}
			System.out.println();
		}
		//2���� �迭�� ����
		System.out.println("\n2���� �迭�� ����");
		data=sum; 
		//2���� �迭 ����
			int [][] arr = new int[len][bottom];
			for(int i=0; i<=len; i++) {
				for(int j=half-i; j<=half+i; j++) {
				arr[i][j] = data--;
				
			}
		}
			for(int[] a : arr) {
				for(int i : a) {
					if(i==0) System.out.printf("%3c",' ');
					else System.out.printf("%3d", i);
				}
			}
	}
}
