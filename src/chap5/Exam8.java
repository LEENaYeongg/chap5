package chap5;

public class Exam8 {

	public static void main(String[] args) {
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		for (int[] a : arr) {// 첨자 사용 불가,결과에 숫자만 표기가능
			for (int i : a) {
				System.out.printf("%3d", i);
			}
			System.out.println();
		}
	}
}
