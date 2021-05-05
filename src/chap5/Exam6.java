package chap5;

/*
 * int arr[][] = {{1}, {10,20,3,4,5,6}, {30,40,50}, {60,70,80,90}};
 * 
 * 2차원 배열의 행의 합과 열의 합 구하기
 * [결과]
 * 0행의 합 :1
 * 1행의 합 :48
 * 2행의 합 :120
 * 3행의 합 :300
 * 0행의 합 :101
 * 1행의 합 :130
 * 2행의 합 133
 * 3행의 합 :94
 * 4행의 합 :5
 * 5행의 합 :6
 * 
 * 
 * 내 생각 : 
 * 1. 일단 첫번째 [i][j]로 두고 i가 1씩 증가하면서 더하고, j가 1씩 증가하면서 더하고
 * 2. .length 는 
 * 
 * */
public class Exam6 {

	public static void main(String[] args) {
/*		내 소스
 * 		int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
		int arr1[] = new int[4];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.print(i + "행의 합: " + sum);
		}
			int sum1 = 0;
			System.out.println();
			for(int k = 0; k < arr.length; k++) {
				for(int g=0; g<arr.length; g++) {
					sum1 += arr[k][g];
					System.out.print(k + "행의 합: " + sum1);
				
			}
		} */
		int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
		int maxcol = 0;
		for(int i =0; i<arr.length; i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		int col[] = new int[maxcol]; // maxcol 현재 내 행중에 가장 긴 열.
		// maxcol 이라는 새로운 배열을 만들어 안에 새로운 값을 넣는다.
		for(int i =0; i<arr.length; i++) {
			int sum =0;
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
				col[j]+=arr[i][j]; // 문제의 핵심!!
			}
			System.out.println(i+"행의 합:"+sum);
		}
		for(int i=0; i<col.length; i++) {
			System.out.println(i+"열의 합:"+col[i]);
		}
	}
}
