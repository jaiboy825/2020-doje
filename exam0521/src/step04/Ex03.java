package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러(1단계)  - 10개의 주석 있어요.
 * 1) 추가 : 번호가 적힌 곳을 따라 가며 주석 달기(자세하게 설명)
 * 2) 삭제 : 번호가 적힌 곳을 따라 가며 주석 달기(자세하게 설명)
 * 3) 삽입
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;	// 1. 변수 cnt의 값에 2를 할당한 이유는? 답 : 배열 arr에서 2번째의 값부터 0으로 되어있기 때문에 
		boolean run = true;
		
		while(run) {			
			for(int i = 0; i < cnt; i++) { // arr 출력하기
				System.out.print(arr[i] + " ");
			}
			System.out.println(); // 메뉴 출력하기
			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[0]종료");	
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();// 메뉴 선택하기
			if(sel == 1) {	// [1]추가 선택한 경우		
				if(cnt > 4) { // 2.왜 추가할 수 없을까? 배열의 크기가 0 1 2 3 4 이렇게 총 5의 크기를 가지고 있는데 4보다 크다면 배열을 넘기 떄문
					System.out.println("[메세지]더이상 추가할 수 없습니다.");
					continue; //아래 실행문을 건너뛰고 while문으로 이동해라.
				}				
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				
				arr[cnt] = data; //3. arr[cnt] 번에 data값을 삽입
				cnt = cnt + 1; //4. 배열에서 0의 값을 가지고 있는 번호(3)
				
			} else if(sel == 2) { //[2]삭제 선택한 경우
				if(cnt == 0) {//5. 왜 삭제할 수 없을까? cnt가 0이라면 0이상의 수를 가지고 있지 않아서이다.
					System.out.println("[메세지]더이상 삭제할 값이 없습니다.");
					continue; //아래 실행문을 건너뛰고 while문으로 이동해라.
				}
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				int delIdx = -1; //6.왜 -1 을 할당했을까? 삭제할 값이 배열에 있는지 없는지 판단을 하기 위해서
				for(int i = 0; i < cnt; i++) {
					if(arr[i] == data) {
						delIdx = i; //7. delIdx에 할당되는 i 의 의미는? 배열에 i번째에 사용자가 삭제하려는 값이 있다는것
					}
				}
				System.out.println("삭제 위치" + delIdx+" " + cnt);
				if(delIdx == -1) {//8.delIdx는 언제 -1 일까? 사용자가 입력한 data라는 값이 배열에 없을때
					System.out.println("[메세지]해당 값은 존재하지 않습니다.");
				}else {
					for(int i = delIdx; i < cnt-1; i++) { //9. i를 delIdx로 설정을 함으로서 삭제할 값이 있는 배열[n]번 부터 cnt-1(수가 있는 곳)까지 하나씩 증가
						arr[i] = arr[i+1]; //10.삭제할 값이 있는 곳을 다음 순서의 배열 값을 삽입을 한다(10 20 30이 있을때 20을 삭제한다고 치면 20이 있는곳에 30값을 삽입 해주고 30 값이 있는곳에는 0을 삽입
					}
					cnt = cnt - 1;// 배열 인덱스 줄이기(삭제되었기 때문에)
					arr[cnt] = 0; // 삭제값으로 인한 값이 앞으로 이동했기 때문에 0으로 깔끔하게 초기화시키는 식
				}
			} else if(sel == 3) { //[3]삽입 선택한 경우 ==> 추가의 개념과 다름.
				if(cnt > 4) {     //5개의 정수를 저장할 배열의 인덱스보다 큰 경우
					System.out.println("[메세지]더이상 삽입할 수 없습니다.");
					continue;     //아래 실행문을 건너뛰고 while문으로 이동해라.
				}
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt(); //삽입하고자 하는 위치의 인덱스 값 입력받기
				if(cnt < idx || idx < 0) { //삽입하고자 하는 위치의 인덱스 값이 이미 입력된 자료의 갯수보다 값이 클 때 또는 삽입하고자 하는 위치의 인덱스가 음수인 경우 안됨. 
					System.out.println("[메세지]해당 위치에는 삽입할 수 없습니다.");
					continue;  //아래 실행문을 건너뛰고 while문으로 이동해라.
				}
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				for(int i = cnt; i > idx; i--) { //마지막 값의 인덱스(cnt)부터 시작해서 입력된 삽일할 위치 다음 값까지 오른쪽으로 1칸씩 이동시킴
					arr[i] = arr[i-1]; //입력된 삽입할 위치를 기준으로 값 이동하기 - 뒤로 1칸씩 밀어내기 
				}
				arr[idx] = data; //입력된 삽입할 위치에 data 값 저장하기
				cnt = cnt + 1; // 배열 인덱스 늘리기(삽입되었기 때문에)
			} else if(sel == 0) { //[0]종료 선택한 경우
				run = false;      // while 문을 빠져나오는 경우 설정
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
	}
}