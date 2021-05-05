package chap5;

/*
 * command 라인에 숫자로만 이루어진 문자열들을 입력받아
 * 모든 자리수의 합을 출력하기. 숫자로만 이루어진 문자열이 아닌 경우 문자열 제외하기
 * 
 * java Exam5 123 1-1 456
 * 1+2+3+4+5+6=21
 * 
 * */
public class Exam5 {

	public static void main(String[] args) {
		if (args.length == 0) { // 나한테 내용이 들어온 게 없어 라는 뜻.= 파라미터 값이 없다=args의 길이가 0이다.
			System.out.println("Command 라인에 파라미터를 입력하세요");
			System.out.println("Java chap5.Exam5 123 456");
			return; // 메서드 종료.
		}

		int sum = 0;
		for (int a = 0; a < args.length; a++) { // 개선된 for구문. 인덱스 사용 불가.
			boolean b = true;
			for (int i = 0; i < args[a].length(); i++) {
				if (args[0].charAt(i) < '0' || args[a].charAt(i) > '9') {
					b = false;
					break;
				}
			}
			if (b) {
				for(int i =0; i<args[a].length(); i++) {
					System.out.print(args[a].charAt(i) 
							+ ((a == args.length - 1 && i == args[a].length() -1) ? "=" : "+"));
					sum += args[a].charAt(i) - '0';
				}
			}
		}
		System.out.print(sum);
	}
}
