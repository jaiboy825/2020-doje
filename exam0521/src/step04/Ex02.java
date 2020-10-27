package step04;

import java.util.Scanner;
/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(1 ~ 7)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 10000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * seat = [ ][ ][ ][ ][ ][ ][ ]
 * 좌석선택 : 1
 * seat = [ ][O][ ][ ][ ][ ][ ]
 * 좌석선택 : 3
 * seat = [ ][O][ ][O][ ][ ][ ]
 * 좌석선택 : 3
 * seat = [ ][O][ ][O][ ][ ][ ]
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 20000원
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int[] seat = new int[7];	
		int cnt = 0;	
		boolean run = true; 
		while(run) {		
			for(int i = 0; i < 7; i++) {
				if( seat[i] == 0 ) {// 1. 좌석 배열 seat의 예매 여부를 판단하는 조건
					System.out.print("[ ]");
				}else {
					System.out.print("[O]");
				}
			}
			System.out.println();			
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();			
			if(sel == 1) { // 1. 좌석예매 선택함
				System.out.print("좌석번호 선택[1 ~ 7] : ");
				int idx = scan.nextInt(); 
				idx = idx - 1;
				//2. 예약여부를 판단하기 위한 배열 seat의 idx 값 조정하기 
				
				if(seat[idx] == 0) { // 3. 예매 여부 판단하는 조건
				seat[idx] = 1;       // 4. 배열 seat에 예약 완료 표시하기
				cnt += 1;     // 5. 예약 수를 카운팅하기
				}else {
					System.out.println("이미 예매가 완료된 자리입니다.");
				}
			} else if(sel == 2) { //2. 종료 선택함			
				int total = cnt * 10000;        // 6. 매출액 계산식을 적으시오.
				System.out.println("매출액 = " +total + "원");		
				run = false;
			}
		}	
		scan.close();
	}
}
