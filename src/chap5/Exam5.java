package chap5;

/*
 * command ���ο� ���ڷθ� �̷���� ���ڿ����� �Է¹޾�
 * ��� �ڸ����� ���� ����ϱ�. ���ڷθ� �̷���� ���ڿ��� �ƴ� ��� ���ڿ� �����ϱ�
 * 
 * java Exam5 123 1-1 456
 * 1+2+3+4+5+6=21
 * 
 * */
public class Exam5 {

	public static void main(String[] args) {
		if (args.length == 0) { // ������ ������ ���� �� ���� ��� ��.= �Ķ���� ���� ����=args�� ���̰� 0�̴�.
			System.out.println("Command ���ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("Java chap5.Exam5 123 456");
			return; // �޼��� ����.
		}

		int sum = 0;
		for (int a = 0; a < args.length; a++) { // ������ for����. �ε��� ��� �Ұ�.
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
