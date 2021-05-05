package chap5;

import java.util.Scanner;
// 10진수를 입력받아 16진수로 출력하기
/*
 * 0 1 2 3 4 5 6 7 8 9 A B C D E F (알파벳들을 어떻게 출력할 건지가 관건)
 * 배열의 첨자를 이용하면 훨씬 간단.
 * 
 * < 내 생각 알고리즘 >
 * char형 배열 사용.
 * 아스키 코드? 알파벳들의 아스키코드를 사용해서 11,12.. 로 맞춘다?
 * 배열의 자릿수를 이용하여 자릿수가 10 이상이 되면 알파벳으로 표현하게 한다.
 * ex) char[17]인 배열에 char[10]번째에 있는 숫자를 표현하면 A
 * 
 * 문자가 여러개니깐 string..? 아니면 문자 한개씩이니깐 char?
 * 
 * 
 * */
public class Exam3 {

	public static void main(String[] args) {
		
		char[] data = 
			{'0','1','2','3','4','5','6','7','8','9','A','B','C','E','F'};
		// [] : 배열의 표시
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10진수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		while (divnum != 0) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;

		}
		System.out.print(num + "의 16진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
	}

}
