package chap5;
/* 배열에 1 ~ 10 까지의 임의의 수를 10개 저장하기
 * 배열에 저장된 수만큼 * 출력하기
 * int arr[] = new int[10];
 * arr[0] = 1 ~ 10 임의의 수
 * ...
 * 
 * arr = {2,5,1,...}
 * 2:**
 * 5:*****
 * 1:*
 * ...
 * 
 * 1. 배열에 10의 1 ~ 10까지 임의의 수를 저장
 * 2. 배열에 저장된 수만큼 * 출력
 * 
 * 내 생각
 * 1. 랜덤으로 배열안에 숫자 넣기
 * 2. 숫자의 갯수만큼 for문을 사용해서 * 출력
 * 
 * 첫번째 for문 : 3이 입력됐으면 i=1,i<=배열 첫번째 숫자,i++
 * 				System.out.print("*");
 * 두번째 for문 : 첫번째 for문이 끝나면 배열 두번째 칸으로 이동.
 * 				star[0]=4 ****
 * 				star[1]=2 **
 * 				...
 *
 */

public class Exam4 {

	public static void main(String[] args) {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
		System.out.println();

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ": ");
			for (int k = 0; k <= arr[j]; k++)
				System.out.print("*");
			System.out.println();
		}

	}

}
