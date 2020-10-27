package step02;

import java.util.Scanner;

/*
 * # ATM[문제]
 * [1]로그인
 * . 계좌번호와 비밀번호를 입력받아 로그인을 처리한다.
 * . 이미 로그인 된 상태에서 다시 이용할 수 없다.
 * [2]로그아웃
 * . 로그아웃 상태에서 이용할 수 없다.
 * [3]입금
 * . 로그인 상태에서 이용할 수 있다.
 * . 입금할 금액을 입력받아 입금을 진행한다.
 * [4]출금
 * . 로그인 상태에서 이용할 수 있다.
 * . 출금할 금액이 계좌잔액을 초과할 경우 출금을 진행할 수 없다.
 * [5]이체
 * . 로그인 상태에서 이용할 수 있다.
 * . 이체할 계좌번호를 입력받아 처리한다.
 * . 이체할 금액이 계좌잔액을 초과할 경우 이체를 진행할 수 없다.
 * [6]잔액조회
 * . 로그인 상태에서 이용할 수 있다.
 * . 로그인 된 회원의 계좌잔액을 출력한다.
 */

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int acc1 = 1111;
		int pw1 = 1234;
		int money1 = 10000;
		
		int acc2 = 2222;
		int pw2 = 1234;
		int money2 = 20000;

		int log = -1;		
		
		while(true) {
			System.out.println("---------");
			/* 다음 주석을 조건문으로 구현하시오. 50번째 줄부터
			 * # log 값의 의미
			 * (1)로그아웃			: -1
			 * (2)acc1 로그인		: 1
			 * (3)acc2 로그인		: 2
			 */
			if(log == -1 ) {
				System.out.println("로그아웃 상태");
			}else if( log == 1 ) {
				System.out.println("acc1[1111] 로그인 중");
			}else if( log == 2   ) {
				System.out.println("acc2[2222] 로그인 중");
			}
			System.out.println("---------");
			//표시된 곳을 찾아가 빈 칸을 채워 코드를 완성합니다.  10개입니다. 동일한 번호는 같은 답입니다.
			System.out.println("[MEGA ATM]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]입금");
			System.out.println("[4]출금");
			System.out.println("[5]이체");
			System.out.println("[6]잔액조회");
			System.out.println("[0]종료");
			
			System.out.print("메뉴를 선택하세요 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {// 로그인 구현
				if(log == -1 ) {  // 1.빈 칸채우기
					System.out.print("[로그인]계좌번호를 입력하세요 : ");
					int myAcc = scan.nextInt();
					System.out.print("[로그인]비밀번호를 입력하세요 : ");
					int myPw = scan.nextInt();
					
					if(myAcc == acc1 && myPw == pw1) {
						        // 2. 코드 완성하기
						log = 1;
						System.out.println("[메세지]1111님 환영합니다.");
					}else if(myAcc == acc2 && myPw == pw2) {
						        // 3. 코드 완성하기
						log = 2;
						System.out.println("[메세지]2222님 환영합니다.");
					}else {
						System.out.println("[메세지]계좌번호와 비밀번호를 확인해주세요.");
					}
				}else {
					if(log == 1) {
						System.out.println("[메세지]현재 1111님 로그인 중입니다.");
					}else if(log == 2) {
						System.out.println("[메세지]현재 2222님 로그인 중입니다.");
					}
				}
			}
			else if(sel == 2) { // 로그아웃 구현
				if( log >= 1) { // 4.빈 칸채우기
					log = -1;
					System.out.println("[메세지]로그아웃 되었습니다.");
				}else {
					System.out.println("[메세지]로그인 후 이용해주세요.");
				}
			}
			else if(sel == 3) { // 입금 구현
				if(log >= 1 ) {  // 4.빈 칸채우기
					System.out.print("[입금]금액을 입력하세요 : ");
					int money = scan.nextInt();
					if( log == 1  ) { // 5. 빈 칸채우기
						money1 = money1 + money;
					}else if( log == 2  ) { // 6. 빈 칸채우기
						money2 = money2 + money;
					}
					System.out.println("[메세지]입금을 완료하였습니다.");
				}else {
					System.out.println("[메세지]로그인 후 이용해주세요.");
				}
			}
			else if(sel == 4) { // 출금 구현
				if( log >= 1  ) { // 4.빈 칸채우기
					System.out.print("[출금]금액을 입력하세요 : ");
					int money = scan.nextInt();
					if(log == 1) {
						if(money1 >= money) {
							                //7. 코드 완성하기
							money1 = money1 - money;
							System.out.println("[메세지]출금을 완료하였습니다.");
						}else {
							System.out.println("[메세지]계좌잔액이 부족합니다.");
						}
					}else if(log == 2) {
						if(money2 >= money) {
							                // 8. 코드 완성하기
							money2 = money2 - money;
							System.out.println("[메세지]출금을 완료하였습니다.");
						}else {
							System.out.println("[메세지]계좌잔액이 부족합니다.");
						}
					}
				}else {
					System.out.println("[메세지]로그인 후 이용해주세요.");
				}
			}
			else if(sel == 5) { // 이체구현
				if( log >= 1  ) { // 4.빈 칸채우기
					System.out.print("[이체]계좌번호를 입력하세요 : ");
					int acc = scan.nextInt();
					
					if(log == 1 && acc == acc2) {  // 9. 빈 칸채우기
						System.out.print("[이체]금액을 입력하세요 : ");
						int money = scan.nextInt();
						
						if(money1 >= money) {
							money1 = money1 - money;
							money2 = money2 + money;
							System.out.println("[메세지]이체를 완료하였습니다.");
						}else {
							System.out.println("[메세지]계좌잔액이 부족합니다.");
						}
					}else if(log == 2 && acc == acc1) {
						System.out.print("[이체]금액을 입력하세요 : ");
						int money = scan.nextInt();
						
						if(money2 >= money) { // 10. 빈 칸채우기
							money2 = money2 - money;
							money1 = money1 + money;
							System.out.println("[메세지]이체를 완료하였습니다.");
						}else {
							System.out.println("[메세지]계좌잔액이 부족합니다.");
						}
					}else {
						System.out.println("[메세지]계좌번호를 확인해주세요.");
					}
				}else {
					System.out.println("[메세지]로그인 후 이용해주세요.");
				}
			}
			else if(sel == 6) { // 잔액조회 구현
				if(log >= 1  ) { // 4.빈 칸채우기
					if(log == 1) {
						System.out.println("[메세지]현재 고객님의 계좌잔액은 " + money1 + "원 입니다.");
					}else if(log == 2) {
						System.out.println("[메세지]현재 고객님의 계좌잔액은 " + money2 + "원 입니다.");
					}
				}else {
					System.out.println("[메세지]로그인 후 이용해주세요.");
				}
			}
			else if(sel == 0) { // 종료
				System.out.println("[메세지]프로그램 종료");
				break;
			}			
		}
		scan.close();
	}
}
