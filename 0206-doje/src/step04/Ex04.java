package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM(3단계)[문제]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * . 5명이상 입력시 배열의 크기를 자동으로 늘려줌
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 * 
 * 주의:리스트 사용금지
 */

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 }; // 계좌번호 배열
		int[] tmpacc = new int[accs.length];
		int[] pws = { 1111, 2222, 0, 0, 0 }; // 비밀번호 배열
		int[] tmppw = new int[accs.length];

		int cnt = 2;

		boolean run = true;
		while (run) {
			System.out.println(Arrays.toString(accs));
			System.out.println("1.가입");
			System.out.println("2.탈퇴");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			boolean ju = false;
		

			if (sel == 1) {
				System.out.println("가입하실 계좌를 입력하세용");
				int ga = scan.nextInt();
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == ga) {
						
						ju = true;
					}
					
				}
				if(ju) {
					System.out.println("중복된 계좌 입니다.");
					continue;
				}
				System.out.println("비밀번호를 입력하세요");
				int gapw = scan.nextInt();
				for (int i = 0; i < accs.length; i++) {
					if (accs[accs.length - 1] != 0) {
						
						for(int j=0; j < tmpacc.length; j++) {
							tmpacc[j] = accs[j];
							tmppw[j] = pws[j];
						}
						accs= new int[tmpacc.length+1];
						pws= new int[tmpacc.length+1];
						for(int  j=0; j < accs.length; j++) {
							if(j <accs.length-1) {
								
								accs[j] = tmpacc[j];
								pws[j] = tmppw[j];
							}else {
								accs[j] = ga;
								pws[j] = gapw;
							}
							
						}
						tmpacc = new int[accs.length];
						tmppw = new int[accs.length];
						break;
						
						
					} else if (accs[i] == 0) {
						accs[i] = ga;
						pws[i] = gapw;
						break;
					}

				}
			} else if (sel == 2) {
				System.out.print("삭제할 값: ");
				int s = scan.nextInt();
				int idx = 0;
				for(int i =0; i < accs.length; i++) {
					if(accs[i] == s) {
						idx = i;
						ju = true;
					}
				}
				if(!ju) {
					System.out.println("없는계좌");
					continue;
				}
			
				tmpacc = new int[accs.length-1];
				tmppw = new int[accs.length-1];
				for(int i =0; i < tmpacc.length; i++) {
					if(i >= idx ) {
						tmpacc[i] = accs[i+1];
						tmppw[i] = pws[i+1];
						
					}else {
						tmpacc[i] = accs[i];
						tmppw[i] = pws[i];
					}
				}
				accs = new int[tmpacc.length];
				for(int i = 0; i< accs.length; i++) {
					accs[i] = tmpacc[i];
					pws[i] = tmppw[i];
				}
				
				
			}

		}

		scan.close();

	}
}