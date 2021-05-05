package chap5;
/* �迭�� 1 ~ 10 ������ ������ ���� 10�� �����ϱ�
 * �迭�� ����� ����ŭ * ����ϱ�
 * int arr[] = new int[10];
 * arr[0] = 1 ~ 10 ������ ��
 * ...
 * 
 * arr = {2,5,1,...}
 * 2:**
 * 5:*****
 * 1:*
 * ...
 * 
 * 1. �迭�� 10�� 1 ~ 10���� ������ ���� ����
 * 2. �迭�� ����� ����ŭ * ���
 * 
 * �� ����
 * 1. �������� �迭�ȿ� ���� �ֱ�
 * 2. ������ ������ŭ for���� ����ؼ� * ���
 * 
 * ù��° for�� : 3�� �Էµ����� i=1,i<=�迭 ù��° ����,i++
 * 				System.out.print("*");
 * �ι�° for�� : ù��° for���� ������ �迭 �ι�° ĭ���� �̵�.
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
