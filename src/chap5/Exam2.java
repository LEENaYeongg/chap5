package chap5;

import java.util.Scanner;

// 10������ �Է¹޾� 8������ ����ϱ�
public class Exam2 {

	public static void main(String[] args) {
		int[] octal = new int[11];
		System.out.println("8������ ��ȯ�� 10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		while (divnum > 0) {
			octal[index++] = divnum % 8;
			divnum /= 8;

		}
		System.out.println(num + "�� 8���� : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		System.out.println();

	}

}
