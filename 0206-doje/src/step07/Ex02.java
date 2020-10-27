package step07;

import java.util.ArrayList;
import java.util.List;

//# 아티스트 관리 프로그램 2단계

class Manager{
	private List<Artist> list = new ArrayList<Artist>();
	public void loadJson(String file) {
		//file명을 입력받아서 list 에 넣어준다.
		
	}
	
	public void add(String user_id, String user_pw, String user_name, String user_about) {
		//4개의 값을 받아 새로운 유저를 만들어서 list에 넣어준다.
		//이때 id는 자동으로 증가되어 들어간다. json 파일에 10번까지 있으니 새로운 유저가 들어가면 11번이된다.
		//이후 추가시에는 12번이 된다.
	}
	
	public void save() {
		//현재 list에 있는 데이터를 artist.json에 다시 저장한다.
	}
}

public class Ex02 {
	public static void main(String[] args) {

		Manager m = new Manager();
		m.loadJson("artist.json");
		
		//여기서 유저를 추가할 수 있도록 메뉴를 구성한다
		/*
		 * 1. 유저 추가
		 * 2. 저장
		 * 3. 삭제  => 삭제할 유저의 user_id를 입력하여 삭제해준다.
		 * 3. 검색
		 * 4. 종료
		 */
		//유저 추가의 인터페이스는 자율적으로 하되 4개의 값(id,pw,name, about)을 입력받아 저장해야 한다.
		//검색시 사용자의 이름을 입력받고 해당 이름이 포함된 사용자를 전부 출력한다. Ex01과 동일함
		//저장시 m.save가 호출되고 현재 데이터가 저장된다.
		//저장후 종료하고 다시 실행하면 이전데이터가 그대로 살아있어야 한다.
	}
}
