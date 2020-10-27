package step07;

class Application {
	public Application() {
		Manager m = new Manager();
		m.loadJson("artist.json");
	}
	
	public boolean login(String id, String pw) {
		//아이디와 비밀번호가 존재하는 사람의 경우 true, 
		//그렇지 않으면 false를 반환
		
		return false;
	}
	
	public void printUserInfo() {
		//현재 로그인된 유저의 정보를 출력한다.(형식은 다음과 같이)
		/*"id": 9,
		"user_id": "hoc660115",
		"user_pw": "Whang1111",
		"user_name": "황영철",
		"user_about": "만천리에 인정받는 그날까지"*/
	}
	
	public void adjustInfo(Artist artist) {
		//아티스트 정보를 받아서 해당 정보로 수정한다.
		//자동으로 m.save()를 호출하여 저장한다.
	}
	
	public void logout() {
		//로그아웃 처리
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Application app = new Application();
		
		/*
		 *다음과 같이 메뉴를 구성한다.
		 *1. 로그인 => 로그인되지 않은 사람만 뜬다.
		 *2. 정보보기  => 로그인 한 사람만 뜬다.
		 *3. 정보수정 => 로그인 한 사람만 뜬다. 
		 *4. 로그아웃 => 로그인 한 사람만 뜬다.
		 *5. 종료
		 */
		
		// 로그인 후에 정보보기 시
	}
}
