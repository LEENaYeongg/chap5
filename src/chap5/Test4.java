package chap5;

import java.util.Scanner;

/*
 * 2���� �迭�� �̿��Ͽ� ������ ����ϱ�

[���]
�迭�� ũ�⸦ Ȧ���� �Է��ϼ���
5

  17 16 15 14 13 
     12 11 10 
         9 
     8  7  6 
  5  4  3  2  1
 * 
 * */
public class Test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���̸� Ȧ���� �Է��ϼ���.");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int sum = 0;
		
		for (int i = 1; i <= num; i += 2)
			sum += i;
		int data = sum * 2 - 1; // ���۵Ǵ� ���ڰ�
		for (int i = 0; i <= matrix.length / 2; i++) { // ���� �����ؼ� �˰����� ã�Ƴ����Ѵ�.
			for (int j = i; j < matrix.length - i; j++) {
				matrix[i][j] = data--;
			}
		}
		for (int i = matrix.length / 2 + 1; i < matrix.length; i++) {
			for (int j = matrix.length - i - 1; j <= i; j++) { //1�� ��ħ
				matrix[i][j] = data--;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0)
					System.out.print("    ");
				else
					System.out.printf("%4d", matrix[i][j]); //4d ==> 4�ڸ��� Ȯ���ؼ� ���.
			}
			System.out.println();
		}
	}
}
