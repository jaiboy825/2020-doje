package step2;

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

		String acc1 = "gondr";
		String pw1 = "1234";
		int money1 = 10000;

		String acc2 = "yydh";
		String pw2 = "1234";
		int money2 = 20000;

		int login = 0;

		String id = "";
		String pw = "";
		int money = 0;
		/*
		 * 이곳에 필요한 변수를 선언하세요. (Hint. 로그인상태를 저장하거나 누가 로그인되었는지를 저장하는 변수가 필요합니다.)
		 */

		while (true) {
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

			/* 아래의 중괄호에 알맞은 코드를 작성하세요 */
			if (sel == 1) {
				if (login == 0) {
					System.out.println("id 를 입력하세요");
					id = scan.next();
					if(id.equals(acc1)) {
					System.out.println("pw를 입력하세요");
					pw = scan.next();
					if(pw.equals(pw1)) {
					System.out.println("로그인 성공!");
					login = 1;
					money = money1;
					continue;
					}
					}else if(id.equals(acc2)) {
						System.out.println("pw를 입력하세요");
						pw = scan.next();
						if(pw.equals(pw2)) {
						System.out.println("로그인 성공!");
						login = 1;
						money = money2;
						continue;
						}
						}
				} else {
					System.out.println("이미 로그인 되었습니다");
					continue;
				}
			} else if (sel == 2) {
				if (login == 1) {
					System.out.println("로그아웃 되었습니다");
					login = 0;
					continue;
				} else {
					System.out.println("비 로그인 상태에서는 로그아웃을 할수 없습니다");
					continue;
				}
			} else if (sel == 3) {
				if (login == 1) {
					int pmo = 0;
					System.out.println("얼마를 입금하시겠습니까?");
					pmo = scan.nextInt();
					money = money + pmo;
					System.out.println("입금 완료");
					continue;
				} else {
					System.out.println("비 로그인 상태에서는 입금을 할수 없습니다");
					continue;
				}
			} else if (sel == 4) {
				if (login == 1) {
					int mmo = 0;
					System.out.println("얼마를 출금하시겠습니까?");
					mmo = scan.nextInt();
					if (mmo <= money) {

						money = money - mmo;
						System.out.println("출금 완료");

						continue;
					}else {
						System.out.println("보유하신 금액이 부족합니다");
						continue;
					}
				} else {
					System.out.println("비 로그인 상태에서는 입금을 할수 없습니다");
					continue;
				}
			} else if (sel == 5) {
				if(login == 1) {
					System.out.println("이체할 계좌번호를 입력하세요");
					String acc = scan.next();
					int passmo = 0;
					if(acc.equals(acc1)) {
						System.out.println("얼마를 이체하시겠습니까?");
						passmo = scan.nextInt();
						if(passmo <= money) {
						money1 = money1 + passmo;
						money = money - passmo;
						System.out.println("이체 성공");
						continue;
						}else {
							System.out.println("보유하신 금액이 부족합니다");
							continue;
						}
						
					}else if (acc.equals(acc2)) {
						System.out.println("얼마를 이체하시겠습니까?");
						passmo = scan.nextInt();
						if(passmo <= money) {
						money2 = money2 + passmo;
						money = money - passmo;
						System.out.println("이체 성공");
						continue;
						}else {
							System.out.println("보유하신 금액이 부족합니다");
							continue;
						}
					}else {
						System.out.println("없는 계좌 입니다.");
						continue;
					}
				}else {
					System.out.println("비 로그인 상태에서는 이체를 하실수 없습니다.");
					continue;
				}
			} else if (sel == 6) {
				if(login == 1) {
					System.out.println("잔액 :" + money);
					continue;
				}else {
					System.out.println("비로그인 상태에서는 잔액조회를 하실수 없습니다");
					continue;
				}
			} else if (sel == 0) {
				System.out.println("[메세지]프로그램 종료");
				break;
			}

		}

		scan.close();
	}
}
