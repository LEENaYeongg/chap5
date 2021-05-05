package chap5;

/* int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}}; 
	score �迭���� ���� ���ΰ� 1�� ��ū �迭 result �迭 �����ϱ�.
	score �迭�� ������ result�� �����ϰ�,
	�� �߰��� ��� ������ �� ��� ���� ���� �����ϰ�, 
	result �迭�� ���� ����ϱ�

	[���]
	90   80  70    240
	95   85  75    255
	70   80  75    225
	75   70  85    230
	70   75  80    225
	400  390 385   1175
*/
public class Test2 {

	public static void main(String[] args) {
		/*
		 * int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}}; int
		 * maxcol = 0; for(int i =0; i<score.length; i++) { if(maxcol < score[i].length)
		 * { maxcol = score[i].length; } } int col[] = new int[maxcol]; // maxcol ���� ��
		 * ���߿� ���� �� ��. // maxcol �̶�� ���ο� �迭�� ����� �ȿ� ���ο� ���� �ִ´�. for(int i =0;
		 * i<score.length; i++) { int sum =0; for(int j=0; j<score[i].length; j++) {
		 * sum+=score[i][j]; col[j]+=score[i][j]; // ������ �ٽ�!!
		 * System.out.print(score[i][j]+"\t"); // �� �迭 ��ҵ� } System.out.println(sum);
		 * //240 255 225 230 225 } int sum1 = 0; for(int i=0; i<col.length; i++) {
		 * System.out.print(col[i]+"\t"); // 400 390 385 sum1 += col[i]; }
		 * System.out.print(sum1); //1175 } }
		 * 
		 */

		int[][] score = { { 90, 80, 70 }, { 95, 85, 75 }, { 70, 80, 75 }, { 75, 70, 85 }, { 70, 75, 80 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j];
				result[score.length][j] += score[i][j];
				result[score.length][score[i].length] += score[i][j];

			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
	}
}
