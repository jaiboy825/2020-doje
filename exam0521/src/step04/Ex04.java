package step04;

import java.util.Scanner;

/*
 * # ATM(3단계) -  10개 주석 문제 및 코드 작성하기
 * 1. 가입  == 배열컨트롤러 추가
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴 == 배열컨트롤러 삭제
 * . 계좌번호를 입력받아 탈퇴
 */

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2; //1. cnt 변수는 왜 2일까요? 계정이 0번과 1번에 있기 때문에 삽입을 할수 있는 번호는 2번
		
		boolean run = true;
		while(run) {
			
			for(int i = 0; i < cnt; i++) {
				System.out.println((i+1) + "번째 계좌번호: " + accs[i] + " 비밀번호 : " + pws[i]);
			}
			System.out.println();
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {  // 1.가입  을 선택한 경우
				if(cnt == 5) { // 2. 왜 cnt가 5일때 가입 할 수 없을까요? 배열 accs와 pws의 크기가 5이기 때문에 0 1 2 3 4 이렇게 5라서 배열의 5번째라면 배열의 크기를 넘기 때문
					System.out.println("더이상 가입할 수 없습니다.");
					continue;
				}
				System.out.print("[가입]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
				
				int check = 1; //3. check 변수의 역할은? 계좌번호 중복 검사
				for(int i = 0; i < cnt; i++) {
					if(accs[i] == myAcc) {// 4. 조건문을 글로 적으면? accs[i]번째가 myAcc와 같다면 계좌번호 중복이다. 같은 값이 있다면 check를 -1로 설정 한다.
						check = -1;
					}
				}
				if(check == -1) {
					System.out.println("계좌번호가 중복됩니다.");
				}else {
					System.out.print("[가입]비밀번호 입력 : ");
					int myPw = scan.nextInt();
			//5. 계좌 가입으로 인해  계좌번호와 비밀번호의 배열 추가하는 코드 입력(3줄임)	
					accs[cnt] = myAcc;
					pws[cnt] = myPw;
					cnt+= 1;
					
						
				}
			}
			else if(sel == 2) {//2.탈퇴를 선택한 경우
				
				System.out.print("[탈퇴]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
				
				int check = -1; //6. check 변수의 역할은? 탈퇴할 계좌번호가 배열에 있는지 없는지 확인용
				for(int i = 0; i < cnt; i++) {
					if(accs[i] == myAcc) {
						check = i; //7. check 변수에 i 값을 저장한다는 의미는? 탈퇴할 계좌번호가 있는 배열의 인덱스 번호
					}
				}
				if(check == -1) {
					System.out.println("해당계좌번호는 존재하지 않습니다.");
				}else {
					for(int i = check; i < cnt-1; i++) {// 탈퇴 계좌번호의 인덱스 값을 갖고 있는 check ~ 총 계좌개수인 cnt보다 1작은 값까지 수행함.
			//8. 계좌 탈퇴로 인해 계좌번호와 비밀번호의 배열값을 앞 쪽으로 이동하는 코드 입력(2줄임)
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
						
					}
			//9. 계좌 삭제로 인한 배열값 이동에 따른 배열값 0으로 초기화 시키기(계좌번호와 비밀번호)
					accs[cnt] = 0;
					pws[cnt] = 0;
							
					
			//10. 계촤 삭제로 인한 총 계좌 갯수 감소
					cnt-=1;
				}
			}		
		}	
		scan.close();
	}
}
