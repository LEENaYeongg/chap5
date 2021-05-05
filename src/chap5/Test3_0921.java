package chap5;

import java.util.Scanner;

/*
������ ������ 500, 100, 50, 10, 5, 1 �̰�,
������ ������ 5���� �ִٰ� �����Ҷ� ������ ������ŭ�� ���� �����ϰ�, ���� ���� ���� ������ ���� ����ϱ�

[���] 
�ݾ��� �Է��ϼ���
36000
������ �����մϴ�.

�ݾ��� �Է��ϼ���
3010
500��:5
100��:5
50��:0
10��:1
5��:0
1��:0
���� ���� 500��:0��
���� ���� 100��:0��
���� ���� 50��:5��
���� ���� 10��:4��
���� ���� 5��:5��
���� ���� 1��:5�� */
public class Test3_0921 {

	public static void main(String[] args) {
		int[] coin = {500,100,50,10,5,1};
		int[] cnt = {5,5,5,5,5,5};
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int money = scan.nextInt();
		int maxmoney =0;
		for (int i =0; i <coin.length; i++) {
			maxmoney += coin[i] * cnt[i];
		}
		if (money >maxmoney) {
			System.out.println("������ �����մϴ�.");
			return;
		}
		//���� �ٲ��� �� �ִ� �ݾ�.
		for(int i=0; i< coin.length; i++) {
			int coinNum = 0;
			coinNum = money / coin[i];
			if(cnt[i] < coinNum) {
				coinNum = cnt[i];
				cnt[i] =0;
			} else {
				cnt[i] -= coinNum;
			}
			money -= coinNum * coin[i];
			System.out.println(coin[i] + "��:" + coinNum);
		}
		for(int i=0; i<coin.length; i++) {
			System.out.println("���� ����  " + coin[i] + "��  " + cnt[i] + "��");
		}

	}

}
