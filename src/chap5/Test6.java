package chap5;

/*
 * command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
java Test6 10 20

[결과]
10과 20 의 공약수 : 1,2,5,10,
 * */
public class Test6 {

	public static void main(String[] args) {
		if (args.length == 0) { // 나한테 내용이 들어온 게 없어 라는 뜻.= 파라미터 값이 없다=args의 길이가 0이다.
			System.out.println("Command 라인에 파라미터를 입력하세요");
			System.out.println("java Test6 10 20");
			return; // 메서드 종료.
		}
		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);

		System.out.print(num + "과 " + num1 + " 의 공약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0 && num1 % i == 0) {
					System.out.print(i + ", ");
			}
		}
	}
}
