package chap5;

import java.util.Arrays;

// 1���� 9������ ���� �� �ߺ����� �ʴ� ���� 3���� �����ϰ�, �����Ͽ� ����ϱ�.
// �ζ� ��ȣ ���ϱ�� �Ȱ�.
public class Test1 {

	public static void main(String[] args) {
		/*
		 * int[] a = new int[3];
		 * 
		 * for (int i=0; i<a.length; i++) {
		 * 
		 * a[i] = (int)(Math.random()*9)+1;
		 * 
		 * if (a[0]==a[1]) a[1] = (int)(Math.random()*9)+1; if (a[1]==a[2]) a[2] =
		 * (int)(Math.random()*9)+1; if (a[0]==a[2]) a[2] = (int)(Math.random()*9)+1;
		 * 
		 * System.out.print(a[i]+" ");
		 * 
		 * } } }
		 */

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = new int[3];
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * arr1.length);
			int t = (int) (Math.random() * arr1.length);
			int tmp = arr1[f];
			arr1[f] = arr1[t];
			arr1[t] = tmp;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		// Arrays : �迭 ���õ� �޼������ ������ �ִ� Ŭ����
		Arrays.sort(arr2); //�迭 ���� �޼���
		for (int a : arr2) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}
}
