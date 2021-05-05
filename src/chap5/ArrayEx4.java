package chap5;
// Command line에서 파라미터 받기

/*
 * run as -> run configrations -> arguments -> program arguments에 원하는 값을 입력한 후 run을 누르면
 * comsole 창에 입력한 값이 출력.

 * 
 * */
public class ArrayEx4 {

	public static void main(String[] args) {
		if(args.length == 0) { // 나한테 내용이 들어온 게 없어 라는 뜻.= 파라미터 값이 없다=args의 길이가 0이다.
			System.out.println("Command 라인에 파라미터를 입력하세요");
			System.out.println("java chap5.ArrayEx4 홍길동 김삿갓");
			return; //메서드 종료.
		}

		for(String a : args) {  // 개선된 for구문. 인덱스 사용 불가.
			System.out.println(a); //args의 값을 a로 넣어 a를 차례로 출력
		}
	}

}
