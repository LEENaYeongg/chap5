package chap5;
// Command line���� �Ķ���� �ޱ�

/*
 * run as -> run configrations -> arguments -> program arguments�� ���ϴ� ���� �Է��� �� run�� ������
 * comsole â�� �Է��� ���� ���.

 * 
 * */
public class ArrayEx4 {

	public static void main(String[] args) {
		if(args.length == 0) { // ������ ������ ���� �� ���� ��� ��.= �Ķ���� ���� ����=args�� ���̰� 0�̴�.
			System.out.println("Command ���ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("java chap5.ArrayEx4 ȫ�浿 ���");
			return; //�޼��� ����.
		}

		for(String a : args) {  // ������ for����. �ε��� ��� �Ұ�.
			System.out.println(a); //args�� ���� a�� �־� a�� ���ʷ� ���
		}
	}

}
