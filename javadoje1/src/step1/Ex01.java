package step1;

import java.util.Scanner;
/*
 * # 과락[문제]
 * 1. 3과목의 점수를 입력받아 평균이 60점 이상이면 합격이다. 
 * 2. 단, 어느 한 과목이라도 점수가 50점 미만이면 불합격생이다.
 * 3. 합격 여부를 출력한다.
 */

public class Ex01 {
	public static void main(String[] args) {

		int kor, eng, math;
		
		Scanner in = new Scanner(System.in);
		
		/*이곳에 코드를 작성하세요*/
		System.out.println("국어 점수을 입력하세여 : ");
		kor = in.nextInt();
		System.out.println("영어 점수을 입력하세여 : ");
		eng = in.nextInt();
		System.out.println("수학 점수을 입력하세여 : ");
		math = in.nextInt();
		int p = kor + eng + math;
		if(kor <= 50) {
			System.out.println("불합격");
		}else if(eng <= 50) {
			System.out.println("불합격");
		}else if(math <= 50) {
			System.out.println("불합격");
		}else if(p / 3 >= 60) {
			System.out.println("합격");
		}

		
	}
}
