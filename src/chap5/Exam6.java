package chap5;

/*
 * int arr[][] = {{1}, {10,20,3,4,5,6}, {30,40,50}, {60,70,80,90}};
 * 
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 * [���]
 * 0���� �� :1
 * 1���� �� :48
 * 2���� �� :120
 * 3���� �� :300
 * 0���� �� :101
 * 1���� �� :130
 * 2���� �� 133
 * 3���� �� :94
 * 4���� �� :5
 * 5���� �� :6
 * 
 * 
 * �� ���� : 
 * 1. �ϴ� ù��° [i][j]�� �ΰ� i�� 1�� �����ϸ鼭 ���ϰ�, j�� 1�� �����ϸ鼭 ���ϰ�
 * 2. .length �� 
 * 
 * */
public class Exam6 {

	public static void main(String[] args) {
/*		�� �ҽ�
 * 		int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
		int arr1[] = new int[4];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.print(i + "���� ��: " + sum);
		}
			int sum1 = 0;
			System.out.println();
			for(int k = 0; k < arr.length; k++) {
				for(int g=0; g<arr.length; g++) {
					sum1 += arr[k][g];
					System.out.print(k + "���� ��: " + sum1);
				
			}
		} */
		int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
		int maxcol = 0;
		for(int i =0; i<arr.length; i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		int col[] = new int[maxcol]; // maxcol ���� �� ���߿� ���� �� ��.
		// maxcol �̶�� ���ο� �迭�� ����� �ȿ� ���ο� ���� �ִ´�.
		for(int i =0; i<arr.length; i++) {
			int sum =0;
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
				col[j]+=arr[i][j]; // ������ �ٽ�!!
			}
			System.out.println(i+"���� ��:"+sum);
		}
		for(int i=0; i<col.length; i++) {
			System.out.println(i+"���� ��:"+col[i]);
		}
	}
}
