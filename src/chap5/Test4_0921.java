package chap5;

import java.util.Scanner;

/*
 * 4. 강아지, 병아리의 합과 다리수의 합을 입력받아서 강아지의 마리수와 병아리의 마리수를 출력하기.
             (계산이 안될 경우 정답없음 출력하기)

[결과]
강아지와 병아리 의 합계를 입력하세요
10
강아지와 병아리 의 다리의 합계를 입력하세요
20
강아지는0마리이고, 병아리는10마리입니다. 
 * */
public class Test4_0921 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("강아지와 병아리의 합계를 입력하세요.");
		int dog = scan.nextInt();
		System.out.println("강아지와 병아리의 다리의 합계를 입력하세요.");
		int chick = scan.nextInt();
		int i,j;
		boolean check = false;
		for( i=0; i<=chick; i++) {
			for(j=0; j<= chick; j++) {
				if(i+j==dog && 4*i + 2*j == chick) {
					System.out.println("강아지 수 : " + i + ",병아리 수 : " + j);
					check = true;
					break;
				}
			}
		}
		if(!check) {
			System.out.println("정답없음");
		}
		
		
		

/* 		int dog = 0;
		int chicken = 0;
		int tmp = 0;

		dog = num / 2;
		chicken = dog + num % 2;

	      tmp = (dog * 4) + (chicken * 2); // 합계

	      while (true) {
	         // 입력한 다리 수가 공식보다 많을때
	         if (leg > tmp) {
	            dog++;
	            chicken--;
	            tmp = (dog * 4) + (chicken * 2);
	            
	            // 입력받은 다리의 수가 tmp보다 작을 경우
	         } else if (leg < tmp) {
	            dog--;
	            chicken++;
	            tmp = (dog * 4) + (chicken * 2);
	            // 주어진 데이터로 마리수 정할 수 없을 때
	            if (dog < 0 || chicken < 0) {
	               System.out.println("정답없음.");
	               break;
	            }
	            // 같으면 강아지와 병아리 수 출력
	         } else if (leg == tmp) {
	            System.out.print("강아지는"+dog+"마리," +"병아리는"+chicken + "마리 입니다. ");
	            break;
	         }
	      }
	      System.out.println(); */
	}
}
