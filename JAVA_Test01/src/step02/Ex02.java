package step02;

import java.util.Scanner;

/*  주석처리된 (가), (나)에 해당하는 조건식을 입력 후 주석해제하여 프로그램 코드를 완성하시오.
 * # 놀이기구 이용제한[문제] 5분 컷
 * 1. 키를 입력받는다.
 * 2. 키가 120 이상이면, 놀이기구 이용이 가능하다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우에는 놀이기구를 이용할 수 있다.
 * [주의사항] 부모님과의 동행여부를 1 또는 yes가 입력되면 이용가능
 *          0 또는 no가 입력되면 이용불가능을 출력한다.
 */

public class Ex02 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 
		System.out.print("키를 입력하세요 : ");
		     int height = in.nextInt();

		if(height >= 120) {
			System.out.println("[메세지]놀이기구 이용 가능합니다.");
		}else {
			System.out.print("부모님과 함께 오셨나요? Yes(1) No(0) : ");
			 int answer = in.nextInt();
			 
			if(answer == 1) {
				System.out.println("[메세지]놀이기구 이용 가능합니다.");
			}else {
				System.out.println("[메세지]놀이기구 이용 불가합니다.");
			}
		}
		in.close();
	}
}
