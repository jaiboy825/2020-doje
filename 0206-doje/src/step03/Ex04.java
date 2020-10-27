package step03;

import java.util.Scanner;

/*
 * # 쇼핑몰 뒤로가기[문제]
 * [1]남성의류
 * 		(1) 티셔츠
 * 		(2) 바지
 * 		(3) 뒤로가기
 * [2]여성의류
 * 		(1) 가디건
 * 		(2) 치마
 * 		(3) 뒤로가기
 * [0]종료
 * 
 * 뒤로가기 선택시 상위 메뉴로 다시 돌아와야 한다.
 */

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.println("[1]남성의류");
			System.out.println("[2]여성의류");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				while (true) {
					System.out.println("(1)티셔츠");
					System.out.println("(2)바지");
					System.out.println("(3)뒤로가기");
					System.out.print("옵션을 입력하세요 : ");
					int a = scan.nextInt();
					if (a == 1) {

					} else if (a == 2) {

					} else if (a == 3) {
						break;
					}
				}

			} else if (sel == 2) {
				while (true) {
					System.out.println("(1)가디건");
					System.out.println("(2)치마");
					System.out.println("(3)뒤로가기");
					System.out.print("옵션을 입력하세요 : ");
					int a = scan.nextInt();
					if (a == 1) {

					} else if (a == 2) {

					} else if (a == 3) {
						break;
					}
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();

	}
}