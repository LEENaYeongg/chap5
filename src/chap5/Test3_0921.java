package chap5;

import java.util.Scanner;

/*
동전의 종류가 500, 100, 50, 10, 5, 1 이고,
각각의 동전이 5개가 있다고 가정할때 지정된 갯수만큼만 동전 변경하고, 변경 후의 남은 동전의 갯수 출력하기

[결과] 
금액을 입력하세요
36000
동전이 부족합니다.

금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개 */
public class Test3_0921 {

	public static void main(String[] args) {
		int[] coin = {500,100,50,10,5,1};
		int[] cnt = {5,5,5,5,5,5};
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		int maxmoney =0;
		for (int i =0; i <coin.length; i++) {
			maxmoney += coin[i] * cnt[i];
		}
		if (money >maxmoney) {
			System.out.println("동전이 부족합니다.");
			return;
		}
		//동전 바꿔줄 수 있는 금액.
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
			System.out.println(coin[i] + "원:" + coinNum);
		}
		for(int i=0; i<coin.length; i++) {
			System.out.println("남은 동전  " + coin[i] + "원  " + cnt[i] + "개");
		}

	}

}
