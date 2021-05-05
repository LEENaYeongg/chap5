package chap5;

import java.util.Arrays;

// 1부터 9까지의 숫자 중 중복되지 않는 숫자 3개를 선택하고, 정렬하여 출력하기.
// 로또 번호 구하기랑 똑같.
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
		// Arrays : 배열 관련된 메서드들을 가지고 있는 클래스
		Arrays.sort(arr2); //배열 정렬 메서드
		for (int a : arr2) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}
}
