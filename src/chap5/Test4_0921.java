package chap5;

import java.util.Scanner;

/*
 * 4. ������, ���Ƹ��� �հ� �ٸ����� ���� �Է¹޾Ƽ� �������� �������� ���Ƹ��� �������� ����ϱ�.
             (����� �ȵ� ��� ������� ����ϱ�)

[���]
�������� ���Ƹ� �� �հ踦 �Է��ϼ���
10
�������� ���Ƹ� �� �ٸ��� �հ踦 �Է��ϼ���
20
��������0�����̰�, ���Ƹ���10�����Դϴ�. 
 * */
public class Test4_0921 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ���Ƹ��� �հ踦 �Է��ϼ���.");
		int dog = scan.nextInt();
		System.out.println("�������� ���Ƹ��� �ٸ��� �հ踦 �Է��ϼ���.");
		int chick = scan.nextInt();
		int i,j;
		boolean check = false;
		for( i=0; i<=chick; i++) {
			for(j=0; j<= chick; j++) {
				if(i+j==dog && 4*i + 2*j == chick) {
					System.out.println("������ �� : " + i + ",���Ƹ� �� : " + j);
					check = true;
					break;
				}
			}
		}
		if(!check) {
			System.out.println("�������");
		}
		
		
		

/* 		int dog = 0;
		int chicken = 0;
		int tmp = 0;

		dog = num / 2;
		chicken = dog + num % 2;

	      tmp = (dog * 4) + (chicken * 2); // �հ�

	      while (true) {
	         // �Է��� �ٸ� ���� ���ĺ��� ������
	         if (leg > tmp) {
	            dog++;
	            chicken--;
	            tmp = (dog * 4) + (chicken * 2);
	            
	            // �Է¹��� �ٸ��� ���� tmp���� ���� ���
	         } else if (leg < tmp) {
	            dog--;
	            chicken++;
	            tmp = (dog * 4) + (chicken * 2);
	            // �־��� �����ͷ� ������ ���� �� ���� ��
	            if (dog < 0 || chicken < 0) {
	               System.out.println("�������.");
	               break;
	            }
	            // ������ �������� ���Ƹ� �� ���
	         } else if (leg == tmp) {
	            System.out.print("��������"+dog+"����," +"���Ƹ���"+chicken + "���� �Դϴ�. ");
	            break;
	         }
	      }
	      System.out.println(); */
	}
}
