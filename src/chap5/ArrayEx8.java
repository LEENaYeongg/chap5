package chap5;

public class ArrayEx8 {
	/*
	 * ���� �迭�� �ʱ�ȭ
	 * 
	 */
	public static void main(String[] args) {

		int[][] arr = { { 10, 20 }, { 30, 40, 50 }, { 60 } };
		for (int[] a : arr) { // ������ for������ �ٲ�.
			for (int i : a) {
				System.out.printf("%3d\t", i);
			}
			System.out.println();
		}
	}
}
