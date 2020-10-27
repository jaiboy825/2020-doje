package step1;

import java.util.Scanner;

/*
 * # 화폐매수[문제]
 * 금액을 입력받아 해당 금액의 화폐 종류 별 화폐 매수를 출력한다.
 * 예시)
 * 만약 87900원이 입력되었다면 다음과 같이 출력된다. (화폐단위는 한국을 기준으로 하며 없는 단위의 매수는 출력되지 않는다.)
 * 5만원 : 1장
 * 1만원 : 3장
 * 5천원 : 1장
 * 1천원 : 2장
 * 5백원 : 1개
 * 1백원 : 4개
 */

public class Ex03 {
	public static void main(String[] args) {
		int Five = 50000;
		int One = 10000;
		int five = 5000;
		int one = 1000;
		int fh = 500;
		int oh = 100;
		int money;
		int na = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("화폐 값을 입력하세요 : ");
		money = in.nextInt();
		if (money  / Five >= 1) {
			int Fper = money / Five;
			System.out.println("5만원  :" + Fper + "장");
			na = money % Five;
		}if (na / One >= 1) {
			int Oper = na / One;
			System.out.println("1만원  :" + Oper + "장");
			na = na % One;
		}if (na / five >= 1) {
			int fper = na / five;
			System.out.println("5천원  :" + fper + "장");
			na = na % five;
		}if (na / one >= 1) {
			int oper = na / one;
			System.out.println("1천원  :" + oper + "장");
			na = na % one;
		}if (na / fh >= 1) {
			int fhper = na / fh;
			System.out.println("500원  :" + fhper + "개");
			na = na % fh;
		}if (na / oh >= 1) {
			int ohper = na / oh;
			System.out.println("100원  :" + ohper + "개");
			na = na % oh;
		}
	}
}
