package chap5;

import java.util.Scanner;
// 10������ �Է¹޾� 16������ ����ϱ�
/*
 * 0 1 2 3 4 5 6 7 8 9 A B C D E F (���ĺ����� ��� ����� ������ ����)
 * �迭�� ÷�ڸ� �̿��ϸ� �ξ� ����.
 * 
 * < �� ���� �˰��� >
 * char�� �迭 ���.
 * �ƽ�Ű �ڵ�? ���ĺ����� �ƽ�Ű�ڵ带 ����ؼ� 11,12.. �� �����?
 * �迭�� �ڸ����� �̿��Ͽ� �ڸ����� 10 �̻��� �Ǹ� ���ĺ����� ǥ���ϰ� �Ѵ�.
 * ex) char[17]�� �迭�� char[10]��°�� �ִ� ���ڸ� ǥ���ϸ� A
 * 
 * ���ڰ� �������ϱ� string..? �ƴϸ� ���� �Ѱ����̴ϱ� char?
 * 
 * 
 * */
public class Exam3 {

	public static void main(String[] args) {
		
		char[] data = 
			{'0','1','2','3','4','5','6','7','8','9','A','B','C','E','F'};
		// [] : �迭�� ǥ��
		char[] hex = new char[8];
		System.out.println("16������ ��ȯ�� 10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		while (divnum != 0) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;

		}
		System.out.print(num + "�� 16���� : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
	}

}
