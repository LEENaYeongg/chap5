package chap5;

import java.util.Scanner;

/* 10진수를 입력받아 2진수로 출력하기 */
public class Exam1 {

	public static void main(String[] args) {

		int[] binary = new int[32];
		System.out.println("2진수로 변환할 10진수로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		while (divnum > 0) {
			binary[index++] = divnum % 2;
			divnum /= 2;

		}
		System.out.println(num + "의 2진 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}
}
