package chap5;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 다음을 출력하기

[결과]
배열의 크기를 홀수로 입력하세요
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
		System.out.println("길이를 홀수로 입력하세요.");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int sum = 0;
		
		for (int i = 1; i <= num; i += 2)
			sum += i;
		int data = sum * 2 - 1; // 시작되는 숫자값
		for (int i = 0; i <= matrix.length / 2; i++) { // 내가 생각해서 알고리즘을 찾아내야한다.
			for (int j = i; j < matrix.length - i; j++) {
				matrix[i][j] = data--;
			}
		}
		for (int i = matrix.length / 2 + 1; i < matrix.length; i++) {
			for (int j = matrix.length - i - 1; j <= i; j++) { //1이 겹침
				matrix[i][j] = data--;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0)
					System.out.print("    ");
				else
					System.out.printf("%4d", matrix[i][j]); //4d ==> 4자리를 확보해서 출력.
			}
			System.out.println();
		}
	}
}
