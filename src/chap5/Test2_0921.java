package chap5;

import java.util.Scanner;
// 2. 숫자를 입력받아 소수인지 판별하는 프로그램 작성하기
public class Test2_0921 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num % 2 != 0 && num % 3 != 0 || num == 2 || num == 3)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
		// 밑에는 선생님 답
		int cnt =0;
		System.out.println(num + "의 약수 :");
		for(int i=1; i<=num; i++) {
			if(num%1==0) {
				System.out.print(i + ",");
				cnt++;
			}
		}
		System.out.println();
		System.out.print(num + " : ");
		if(cnt == 2) System.out.println("소수입니다.");
		else System.out.println("소수가 아닙니다.");
	}
}
