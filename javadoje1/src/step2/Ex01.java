package step2;

import java.util.Scanner;

/*
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

		String dbId = "gondr";
		String dbPw = "1234";
		
		String ID = "";
		String PW = "";
		Scanner in = new Scanner(System.in);
		System.out.println("ID를 입력해주세요");
		ID = in.next();
		if(ID.equals(dbId)) {
			System.out.println("PW를 입력해주세요");
			PW = in.next();
			if(PW.equals(dbPw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("PW를 확인해주세요");
			}
		}else {
			System.out.println("ID를 확인해주세요");
		}
		
	}
}