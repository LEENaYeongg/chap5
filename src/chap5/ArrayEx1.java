package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 1. 배열의 선언
	//	int[] arr1; //참조변수 선언
		// 2. 배열의 생성
	//	arr1 = new int[5]; //배열 객체
		int[] arr1 = new int[5]; //변수선언과 객체 선언을 같이함.
	// int arr[5]; => 선언 안됨.
		// 3. 배열값 초기화
		arr1[0] =100;
		arr1[1] = 200;
		for(int i=0; i<arr1.length; i++)
			System.out.println("arr1[" + i + "]=" + arr1[i]);

		
		int[] arr2 = new int[10];
		arr2 = arr1;
		for(int i=0; i<arr2.length; i++)
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		arr2[4]=350;
		System.out.println(arr1[4] + "," + arr2[4]);
		
		//개선된 for ==> 첨자,인덱스(방 번호) 는 사용 불가능.
		System.out.println("개선된 for 구문 사용하기");
		for(int i : arr2) //int : 요소(배열안의 알맹이)의 자료형
			System.out.println(i);
	}

}
