package step02;

import java.util.Scanner;

/* 주석처리된 (가), (나)에 해당하는 조건식을 완성한 후 주석해제 후 프로그램 코드를 완성하시오.
 * # 로그인(3단계)[문제]
 * 1. ID를 입력받아 dbId와 일치여부를 확인한다.
 * 2. ID가 틀리면, "ID를 확인해주세요."라는 메세지를 출력한다.
 * 3. ID가 맞으면, PW를 입력할 수 있다.
 * 4. PW를 입력받아 dbPW와 일치여부를 확인한다.
 * 5. PW가 틀리면, "PW를 확인해주세요."라는 메세지를 출력한다.
 * 6. PW가 맞으면, "로그인 성공"이라는 메세지를 출력한다.
 */

public class Ex01 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int dbId = 20121;
        int dbPw = 512; 
		
		System.out.println("[로그인]");
		System.out.print("ID를 입력하세요 : ");
		int myId = in.nextInt();
		
		if(myId == dbId) {
			System.out.print("PW를 입력하세요 : ");
			int myPw = in.nextInt();
			
			if(myPw == dbPw) {
				System.out.println("[메세지]로그인 성공");
			}else {
				System.out.println("[메세지]PW를 확인해주세요.");
			}
		}else {
			System.out.println("[메세지]ID를 확인해주세요.");
		}
		in.close();
	}
	}
