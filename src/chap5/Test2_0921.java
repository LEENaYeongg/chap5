package chap5;

import java.util.Scanner;
// 2. ���ڸ� �Է¹޾� �Ҽ����� �Ǻ��ϴ� ���α׷� �ۼ��ϱ�
public class Test2_0921 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num % 2 != 0 && num % 3 != 0 || num == 2 || num == 3)
			System.out.println("�Ҽ��Դϴ�.");
		else
			System.out.println("�Ҽ��� �ƴմϴ�.");
		// �ؿ��� ������ ��
		int cnt =0;
		System.out.println(num + "�� ��� :");
		for(int i=1; i<=num; i++) {
			if(num%1==0) {
				System.out.print(i + ",");
				cnt++;
			}
		}
		System.out.println();
		System.out.print(num + " : ");
		if(cnt == 2) System.out.println("�Ҽ��Դϴ�.");
		else System.out.println("�Ҽ��� �ƴմϴ�.");
	}
}
