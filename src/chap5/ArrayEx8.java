package chap5;

public class ArrayEx8 {
	/*
	 * 가변 배열의 초기화
	 * 
	 */
	public static void main(String[] args) {

		int[][] arr = { { 10, 20 }, { 30, 40, 50 }, { 60 } };
		for (int[] a : arr) { // 개선된 for문으로 바꿈.
			for (int i : a) {
				System.out.printf("%3d\t", i);
			}
			System.out.println();
		}
	}
}
