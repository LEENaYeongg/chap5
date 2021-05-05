package chap5;

import java.util.Scanner;

/*
 * 다음의 결과가 나오도록 프로그램을 작성하시오.
 * [결과]
 * 삼각형의 높이를 입력하세요
 * 5
 * 15 14 13 12 11  ==> i=0 일때는 0부터
 *    10  9  8  7  ==> i=1 일때는 1부터
 *        6  5  4  ==> i=2 일때는 2부터
 *           3  2  ==> i=3 일때는 3부터
 *              1  ==> i=4 일때는 4부터
 * 
 * */
public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i ++) {
			sum += i;
	}
		for (int i = 0; i <num; i++) { // 내가 생각해서 알고리즘을 찾아내야한다.
			for (int j = 0; j < num ; j++) {

				if (j<i)
					System.out.printf("%3c",' ');
				else
					System.out.printf("%3d", sum--); // 4d ==> 4자리를 확보해서 출력.
			}
			System.out.println();
		}
	}
}
