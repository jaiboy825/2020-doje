package step04;

import java.util.Random;

/*
 * # OMR카드  - 주석 5개 입력하기
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 student에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 student 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 10점이다. 50점 만점이다.
 * 결과 화면 입니다.
 * answer = [1, 3, 4, 2, 5]
 * student = [1, 1, 4, 4, 3]
 * 정오표      = [O, X, O, X, X]
 * 성적         = 20점
 */

public class Ex01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1, 3, 4, 2, 5};
		int[] student = new int[5];               ; // 1. 5개 배열 선언하기	
		for(int i = 0; i < 5; i++) {
			student[i] = ran.nextInt( 5  ) +  1   ; //2. 1부터 5까지 무작위 정수 생성하기
		}
		// 정답 출력
		System.out.print("answer  = [ "); 
		for(int i = 0; i < 5; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("]");
        // 학생 답 출력 - 무작위 생성된 5개 정수겠죠?
		System.out.print("student = [ ");
		for(int i = 0; i < 5; i++) {
			System.out.print(student[i] + " ");
		}
		System.out.println("]");
		// 정오표 만들기 위한 부분
		int cnt = 0;
		System.out.print("정오표      = [ ");
		for(int i = 0; i < 5; i++) {
			if(answer[i] == student[i] ) {//3. 정답 비교하는 코드적기
				System.out.print("O ");
				 cnt+=1; // 4. 맞은 갯수 카운팅하기 count 변수 활용하기
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("]");		
		int score =  cnt*10           ;// 5. 맞은 갯수에 해당 점수 계산하기
		System.out.println("성적         = " + score + "점"); // 성적 출력하기. 끝.	
	}
}
