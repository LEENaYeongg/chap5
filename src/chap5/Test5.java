package chap5;

/*
 * Command ���ο��� ���ڸ� �Է¹޾� ������ ����� ����ϱ�

java Test5 10
int num = Integer.parseInt(args[0]);

[���]
10�� ��� : 1,2,5,10,
 * 
 * */
public class Test5 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("java Test5 10");
			return;
		}
		int num = Integer.parseInt(args[0]); 
		System.out.print(num + "�� ���: ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i +","+" ");
			}
		}
	}
}
