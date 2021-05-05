package chap5;

/*
 * command line���� ���ڷ� �̷���� ���ڸ� �ΰ� �޾Ƽ� �μ��� ������� ���Ͻÿ�
java Test6 10 20

[���]
10�� 20 �� ����� : 1,2,5,10,
 * */
public class Test6 {

	public static void main(String[] args) {
		if (args.length == 0) { // ������ ������ ���� �� ���� ��� ��.= �Ķ���� ���� ����=args�� ���̰� 0�̴�.
			System.out.println("Command ���ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("java Test6 10 20");
			return; // �޼��� ����.
		}
		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);

		System.out.print(num + "�� " + num1 + " �� ����� : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0 && num1 % i == 0) {
					System.out.print(i + ", ");
			}
		}
	}
}
