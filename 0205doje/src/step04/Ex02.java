package step04;

import java.util.Scanner;

/*
 * # 영화관 좌석예매[문제]
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = {0,0,0,0,0,0,0};
		int total = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("좌석 선택 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
				int seatn = scan.nextInt();
				if(seatn == 0) {
					if(seat[0] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[0] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}if(seatn == 1) {
					if(seat[1] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[1] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}if(seatn == 2) {
					if(seat[2] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[2] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}if(seatn == 3) {
					if(seat[3] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[3] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}if(seatn == 4) {
					if(seat[4] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[4] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}if(seatn == 5) {
					if(seat[5] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[5] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}if(seatn == 6) {
					if(seat[6] == 1) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}else {						
						seat[6] = 1;
						total =total + 12000;
						System.out.println("좌석 상황 :" + seat[0]+" "+seat[1]+" "+seat[2]+" "+seat[3]+" "+seat[4]+" "+seat[5]+" "+seat[6]);
					}
				}
				
			}
			else if(sel == 2) {
				run = false;
				System.out.println("매출액 : " + total + "원");
			}
		}
		
		scan.close();
	}
}
