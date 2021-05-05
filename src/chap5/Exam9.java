package chap5;

import java.util.Scanner;

/* [결과] 삼각형의 높이를 입력하세요
		3
		
		   9
	    8  7  6
	 5	4  3  2  1
	 
	 ==> 맨 꼭대기 숫자부터 어떻게 출력해야하는지 규칙을 찾아내야함.
	 
*/
public class Exam9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int len = scan.nextInt();
		// 가장 아래쪽 칸수.
		int bottom = len * 2 - 1;
		int sum = 0;

		/*
		 * 방법1) for(int i =1; i<=len; i++){ 
		 * sum += i*2-1; ==> 바닥의 길이
		 * }
		 */

		// 방법2)
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
					System.out.print("   "); // 숫자 사이이 간격
			}
			System.out.println();
		}
		//2차원 배열로 구현
		System.out.println("\n2차원 배열로 구현");
		data=sum; 
		//2차원 배열 생성
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
