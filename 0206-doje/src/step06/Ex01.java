/*
 * 외부 클래스와 이를 다루는 방법
 * 클래스의 매서드, 멤버변수, 객체지향 
 * ArrayList , List의 순회, 원하는 것 삭제
 * 파일 입출력
 * 2차원 배열
 */
package step06;

//# 학생성적관리 프로그램(1단계)[문제]

class ScoreMng{
	private int[] arr = {87, 100, 11, 72, 92};
	
	public int totalSum() {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		return total;
	}
	
	public int product4(){
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int sa = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				sa +=arr[i];
			}
		}
		return sa;
	}
	
	public int count4() {
		// 문제 3) 4의 배수의 개수 출력
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		// 정답 3) 3
		return cnt;
	}
	
	public int countEven() {
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int cntj = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cntj++;
			}
		}
		return cntj;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		ScoreMng mng = new ScoreMng();
		
		System.out.println("[문제1 : " + mng.totalSum() + "]");
		System.out.println("[문제2 : " + mng.product4() + "]");	
		System.out.println("[문제3 : " + mng.count4() + "]");	
		System.out.println("[문제4 : " + mng.countEven() + "]");	
		
	}
}
