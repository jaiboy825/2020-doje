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
 */

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 1. run 변수를 선언하시오 24번째줄
		boolean run = true;
		while(run) {
			System.out.println("[1]남성의류");
			System.out.println("[2]여성의류");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) { // 남성의류
				while(true) {
					System.out.println("(1)티셔츠");
					System.out.println("(2)바지");
					System.out.println("(3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {}
					else if(choice == 2) {}
					else if(choice == 3) {
						  break;
					}
				}
			}
			else if(sel == 2) { // 여성의류
				while(true) {
					System.out.println("(1)가디건");
					System.out.println("(2)치마");
					System.out.println("(3)뒤로가기");	
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {}
					else if(choice == 2) {}
					else if(choice == 3) {
						break;
					}
				}
			}
			else if(sel == 0) {
				run = false;    // 2. 프로그램 종료를 위한 코드 완성하기
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
		
	}
}
