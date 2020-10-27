package step01;

/*
 * # 화폐매수 2분 컷
 * 해당 금액의 화폐 종류 별 화폐 매수를 출력하는 다음 코드의 
 * 주석 안의 빈 칸(가, 나)를 채운 후 주석을 해제하여
 * 결과를 출력한다.
 * 정답)
 * 5만원 : 1장
 * 1만원 : 4장
 * 5천원 : 1장
 * 1천원 : 2장
 */

public class Ex03 {
	public static void main(String[] args) {

		int money = 97000; 

		int ohMan = money / 50000; 
		int man = money % 50000 / 10000; 
		int oChen = money % 10000 / 5000;
		int chen = money % 5000 / 1000;
		
		System.out.println("5만원 : " + ohMan +"장");
		System.out.println("1만원 : " + man +"장");
		System.out.println("5천원 : " + oChen +"장");
		System.out.println("1천원 : " + chen +"장");
	}
}
