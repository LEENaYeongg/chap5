package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 1. �迭�� ����
	//	int[] arr1; //�������� ����
		// 2. �迭�� ����
	//	arr1 = new int[5]; //�迭 ��ü
		int[] arr1 = new int[5]; //��������� ��ü ������ ������.
	// int arr[5]; => ���� �ȵ�.
		// 3. �迭�� �ʱ�ȭ
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
		
		//������ for ==> ÷��,�ε���(�� ��ȣ) �� ��� �Ұ���.
		System.out.println("������ for ���� ����ϱ�");
		for(int i : arr2) //int : ���(�迭���� �˸���)�� �ڷ���
			System.out.println(i);
	}

}